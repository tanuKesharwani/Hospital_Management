package Entity;

public class DoctorDetails {
     int id;
     String doc_name;
     String doc_email;
     String doc_password;
     int doc_mobile;
     String qualification;
     String specialist;
     String DOB;
	public DoctorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorDetails(int id, String doc_name, String doc_email, String doc_password, int doc_mobile,
			String qualification, String specialist, String dOB) {
		super();
		this.id = id;
		this.doc_name = doc_name;
		this.doc_email = doc_email;
		this.doc_password = doc_password;
		this.doc_mobile = doc_mobile;
		this.qualification = qualification;
		this.specialist = specialist;
		DOB = dOB;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getDoc_email() {
		return doc_email;
	}
	public void setDoc_email(String doc_email) {
		this.doc_email = doc_email;
	}
	public String getDoc_password() {
		return doc_password;
	}
	public void setDoc_password(String doc_password) {
		this.doc_password = doc_password;
	}
	public int getDoc_mobile() {
		return doc_mobile;
	}
	public void setDoc_mobile(int doc_mobile) {
		this.doc_mobile = doc_mobile;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
     
     
     
}
