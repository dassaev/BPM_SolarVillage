package gov.solar.permit;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Resident implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String residentId;
	private java.lang.String residentName;
	private boolean hoaMember;

	private Address address;

	public Resident() {
		this.address = new Address();
	}

	public java.lang.String getResidentId() {
		return this.residentId;
	}

	public void setResidentId(java.lang.String residentId) {
		this.residentId = residentId;
	}

	public java.lang.String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(java.lang.String residentName) {
		this.residentName = residentName;
	}

	public java.lang.String toString() {
		return "Resident::residentId:" + this.residentId + "\nResident::residentName:" + this.residentName
				+ "\nResident::hoaMember:" + this.hoaMember + "\n" + this.address;
	}

	public boolean isHoaMember() {
		return this.hoaMember;
	}

	public void setHoaMember(boolean hoaMember) {
		this.hoaMember = hoaMember;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Resident(java.lang.String residentId, java.lang.String residentName, boolean hoaMember, Address address) {
		this.residentId = residentId;
		this.residentName = residentName;
		this.hoaMember = hoaMember;
		this.address = address;
	}
}