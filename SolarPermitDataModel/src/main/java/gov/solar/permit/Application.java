package gov.solar.permit;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Application implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	
	private Resident resident;
	private java.lang.String applicationId;
	private java.lang.String applicationStatus;
	private java.lang.String electricPermitStatus;
	private java.lang.String hoaApproval;
	private java.lang.String structuralPermitStatus;
	private java.util.Date submitDate;
	private java.lang.String mockedStructuralPermitResult;
	private java.lang.String mockedElectricPermitResult;
	private int mockedStructuralTry;
	private int mockedElectricTry;
	
	public Application() {
		this.resident = new Resident();
	}

	
	public int getMockedStructuralTry() {
		return mockedStructuralTry;
	}


	public void setMockedStructuralTry(int mockedStructuralTry) {
		this.mockedStructuralTry = mockedStructuralTry;
	}


	public int getMockedElectricTry() {
		return mockedElectricTry;
	}


	public void setMockedElectricTry(int mockedElectricTry) {
		this.mockedElectricTry = mockedElectricTry;
	}


	public java.lang.String getMockedStructuralPermitResult() {
		return mockedStructuralPermitResult;
	}

	public void setMockedStructuralPermitResult(java.lang.String mockedStructuralPermitResult) {
		this.mockedStructuralPermitResult = mockedStructuralPermitResult;
	}

	public java.lang.String getMockedElectricPermitResult() {
		return mockedElectricPermitResult;
	}

	public void setMockedElectricPermitResult(java.lang.String mockedElectricPermitResult) {
		this.mockedElectricPermitResult = mockedElectricPermitResult;
	}

	public Resident getResident() {
		return this.resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}

	public java.lang.String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(java.lang.String applicationId) {
		this.applicationId = applicationId;
	}

	public java.lang.String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(java.lang.String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public java.lang.String getElectricPermitStatus() {
		return this.electricPermitStatus;
	}

	public void setElectricPermitStatus(java.lang.String electricPermitStatus) {
		this.electricPermitStatus = electricPermitStatus;
	}

	public java.lang.String getHoaApproval() {
		return this.hoaApproval;
	}

	public void setHoaApproval(java.lang.String hoaApproval) {
		this.hoaApproval = hoaApproval;
	}

	public java.lang.String getStructuralPermitStatus() {
		return this.structuralPermitStatus;
	}

	public void setStructuralPermitStatus(java.lang.String structuralPermitStatus) {
		this.structuralPermitStatus = structuralPermitStatus;
	}

	public java.util.Date getSubmitDate() {
		return this.submitDate;
	}

	public void setSubmitDate(java.util.Date submitDate) {
		this.submitDate = submitDate;
	}

	public java.lang.String toString() {
		return "Application::applicationId:" + this.applicationId + "\nApplication::hoaApproval:" + this.hoaApproval
				+ "\nApplication::electricPermitStatus:" + this.electricPermitStatus
				+ "\nApplication::structuralPermitStatus:" + this.structuralPermitStatus + "\nApplication::submitDate:"
				+ this.submitDate + "\nApplication::applicationStatus:" + this.applicationStatus + "\n" + this.resident;
	}

	public Application(Resident resident, java.lang.String applicationId, java.lang.String applicationStatus,
			java.lang.String electricPermitStatus, java.lang.String hoaApproval,
			java.lang.String structuralPermitStatus, java.util.Date submitDate) {
		this.resident = resident;
		this.applicationId = applicationId;
		this.applicationStatus = applicationStatus;
		this.electricPermitStatus = electricPermitStatus;
		this.hoaApproval = hoaApproval;
		this.structuralPermitStatus = structuralPermitStatus;
		this.submitDate = submitDate;
	}

}