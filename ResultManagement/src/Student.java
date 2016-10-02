
public class Student {
    private String name;
	private String roll;
	private String address;
	private String clsName;
	private String fatherName;
	private String motherName;
	private String admissionData;
	private int rank;

   public String getAdmissionData() {
        return admissionData;
    }
    public void setAdmissionData(String admissionData) {
        this.admissionData = admissionData;
    }
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address="
				+ address + ", clsName=" + clsName + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", rank=" + rank
				+ "]";
	}
	
}
