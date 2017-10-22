public class Disease
{
	private String id;
	private String name;
	private String hazard;
	private String sypm;
	private String meds;
	
	public Disease(){}
	public Disease(String id, String name,String hazard,String sypm, String meds){
		this.id=id;
		this.name=name;
		this.hazard=hazard;
		this.setSypm(sypm);
		this.setMeds(meds);
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHazard() {
		return hazard;
	}
	public void setHazard(String hazard) {
		this.hazard = hazard;
	}
	public String getSypm() {
		return sypm;
	}
	public void setSypm(String sypm) {
		this.sypm = sypm;
	}
	public String getMeds() {
		return meds;
	}
	public void setMeds(String meds) {
		this.meds = meds;
	}
			
}
	
