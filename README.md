# Solar Village

Solar Village is a home work assignment for advanced process development with Red Hat JBoss BPM Suite.
It contains following projects:

1. SolarPermitApp: The kjar project for "New Order Permitting" business process. This process calls SolarPermitService in every 15 seconds to track the permit approval status, this tracking cycle should be set to longer in real life application.
2. SolarPermitService: Government REST service simulator project. It provides RESTful CRUD APIs for permit applications. Instead of database, it uses static MAP object to store permit application data. To simulate real life scenario, it randemly postpones Electric and Structural permit approval to 1 to 3 tracking cycle. Permit approval results (APPROVED/DENIED) need to be provided as mock results when the permit application data is submitted at the first time.
3. SolarPermitDataModel: POJO data model which is used by both of SolarPermitApp and SolarPermitService.
4. SolarPermitTest: SoapUI project which has required SoapUI testcases to test the SolarPermitApp.


Please follow following instructions to set up the environment and run this demo.

## 1. Download Virtual Machine Environment

This POC uses the gpte-bxms-advanced-infrastructure-630 virtual machine from the implementation course.
You can download a copy of the VM from: https://drive.google.com/open?id=0B8mmXW6hJKdiNXNCamItcFFnb2M

## 2. Environment Setup Instructions
### 2.1. JBoss EAP Environment Preparation

This demo requires _Kie Server_ with the _Business-Central_ as its _Controller_, followings are environment setup requirements:

1. _Kie Server_ needs to run at 8230 port, _Business-Central_ needs to run at 8080 port. 
2. Both _Kie Server_ and _Business-Central_ need to use MariaDB instead of H2.
3. _Kie Server_ needs to have at least one user who has "sales" role.
4. _Kie Server_ needs to have at least one user who has "executive" role.

### 2.2. Build and Deploy
#### 2.2.1. Clone the Pepository to Your Local Environment.

It is required to clone the remote maven repository in order to build and deploy the jars and wars that will serve the government permit services:

1. Create a folder to organize your git repositories.

  ```
  $ mkdir ~/gits
  $ cd ~/gits
  ```

2. Execute the git clone command:  

  ```
  $ git clone https://github.com/Yimaier/SolarVillage.git
  ```

#### 2.2.2. Build SolarPermitDataModel Jar

The SolarPermitDataModel jar is used by both SolarPermitService and SolarPermitApp. After Maven build, jar file will be generated under `target` folder.

Using the git repository that we cloned in the previous step, execute the maven install command:

```
$ cd ~/gits/SolarVillage/SolarPermitDataModel
$ mvn clean install
```

#### 2.2.3. Build SolarPermitService Component

The SolarPermitService war component that will serve as government permit REST web services is built during this step. After build, war component will be generated in `target` folder.

Using the git repository that we cloned in the previous step, execute the maven install command:

```
$ cd ~/gits/SolarVillage/SolarPermitService
$ mvn install -P war
```

> **Note**: the war profile is configured to generate a war component for the service tier project.

#### 2.2.4. Deploy SolarPermitService Component on Business-Central Server

The SolarPermitService.war that provide the REST web services can be deployed to any java web server environment. In this demo, we deploy it on Business-Central Server.

Copy the target resources from the Maven projects to JBoss Server:

```
$ cp ~/gits/SolarVillage/SolarPermitService/target/SolarPermitService.war \
 ~/lab/bpms/bc/standalone/deployments
```

### 2.2.5. Build SolarPermitApp Kjar Component

Using the git repository that we cloned in the previous step, execute the maven install command:

```
$ cd ~/gits/SolarVillage/SolarPermitApp
$ mvn clean install
```
# 3. Execute and Test the Process Within SoapUI
## 3.1. Setup SoapUI

1. Locate ~/gits/SolarVillage/SolarPermitTest folder and open "SoapUI-SolarVillage-workspace" workspace or import "solarvillage-soapui-project" project to your existing workspace.
2. Setup following project level custom properties:

Property  | Value Description | Value or Example 
------------- | ------------- | -------------
ContainerId  | Can have any value. | solarcontainer
EndPointURL| EndPoint URL of Kie-Server. | http://127.0.0.1:8230
ProcessId| This value can't be changed, unless we change the full id of the "New Permit Process" in SolarPermitApp. | SolarPermitApp.new-order-permitting
SalesUserId| The user id of the Kie-Server user who has "sales" role associated. | salesUser
ExecutiveUserId| The user id of the Kie-Server user who has "executive" role associated. | executiveUser
ProcessInstanceId| The process instance id of current process, this value will be updaed by the Groovy script. |0
TaskInstanceId| The task instance id of HOA Approval human task in current process, this value will be updaed by the Groovy script. |0

## 3.2. Run TestCases
### 3.2.1. Not HOA Member TestSuite

This TestSuite includes following TestCases:
1. Create Container: creates Kie-Server container to run rest of the TestCases.
2. All Approval: tests solar permit application process for not HOA member with approved electric and structural permit approval result.
3. Electric Approval Structural Deny: tests solar permit application process for not HOA member with approved electric and denied structural permit approval result.
4. Electric Deny Structural Approval: tests solar permit application process for not HOA member with denied electric and approved structural permit approval result.
5. Electric Deny Structural Deny: tests solar permit application process for not HOA member with denied electric and structural permit approval result.
6. Delete Container: deletes Kie-Server container.

### 3.2.2. HOA Member TestSuite

This TestSuite includes following TestCases:
1. Create Container: creates Kie-Server container to run rest of the TestCases.
2. All Approval: tests solar permit application process for HOA member with approved HOA, electric and structural permit approval result.
3. HOA Deny by Sales User: tests solar permit application process for HOA member with denied HOA approval result. Sales group user executes HOA Approval human task.
4. HOA Deny by Executive User: tests solar permit application process for HOA member with denied HOA approval result. Sales group user submits the application, but the human task gets reassigned to executive user group based on the required logic. Executive group user executes HOA Approval human task.
5. HOA Approval Electric Approval Structural Deny: tests solar permit application process for HOA member with approved HOA, approved electric and denied structural permit approval result.
6. HOA Approval Electric Deny Structural Approval: tests solar permit application process for HOA member with approved HOA, denied electric and approved structural permit approval result.
7. HOA Approval Electric Deny Structural Deny: tests solar permit application process for HOA member with approved HOA, denied electric and denied structural permit approval result.
8. Delete Container: deletes Kie-Server container.
