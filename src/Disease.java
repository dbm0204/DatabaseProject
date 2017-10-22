import java.util.ArrayList;
import java.util.Iterator;
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
		this.sypm= sypm;
		this.meds = meds;
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
	
		
}
	
