public class Patient
{
	private String id;
	private String name;
	private String phoneNumber;
	private String Allergy;
	private Doctor doc;
	private Contact person;
	
	public Patient(){}
	public Patient(String PAT_ID, String PAT_NAME, String Allergy, String num, String DocID, String C_name, String C_Number){
		this.id=PAT_ID;
		this.name=PAT_NAME;
		this.setAllergy(Allergy);
		this.setPhoneNumber(num);
		this.doc = new Doctor(DocID);
		this.person = new Contact(C_name, C_Number);
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}
	public Contact getPerson() {
		return this.person;
	}
	public void setPerson(Contact person) {
		this.person = person;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAllergy() {
		return Allergy;
	}
	public void setAllergy(String allergy) {
		Allergy = allergy;
	}
		 
	
}

