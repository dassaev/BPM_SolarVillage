package gov.solar.permit;

public class ServiceResponse implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String applicationId;
	private String structuralPermitStatus;
	private String electricPermitStatus;
	
	
	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getStructuralPermitStatus() {
		return structuralPermitStatus;
	}

	public void setStructuralPermitStatus(String structuralPermitStatus) {
		this.structuralPermitStatus = structuralPermitStatus;
	}

	public String getElectricPermitStatus() {
		return electricPermitStatus;
	}

	public void setElectricPermitStatus(String electricPermitStatus) {
		this.electricPermitStatus = electricPermitStatus;
	}

}
