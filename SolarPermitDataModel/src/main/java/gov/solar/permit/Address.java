package gov.solar.permit;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String addressId;
	private java.lang.String streetAddress;
	private java.lang.String city;
	private java.lang.String state;
	private java.lang.String zip;

	public Address() {
	}

	public java.lang.String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(java.lang.String addressId) {
		this.addressId = addressId;
	}

	public java.lang.String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(java.lang.String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getZip() {
		return this.zip;
	}

	public void setZip(java.lang.String zip) {
		this.zip = zip;
	}

	public Address(java.lang.String addressId, java.lang.String streetAddress, java.lang.String city,
			java.lang.String state, java.lang.String zip) {
		this.addressId = addressId;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public java.lang.String toString() {
		return "Address::addressId:" + this.addressId + "\nAddress::streetAddress:" + this.streetAddress
				+ "\nAddress::city:" + this.city + "\nAddress::state:" + this.state + "\nAddress::zip:" + this.zip;
	}
}
