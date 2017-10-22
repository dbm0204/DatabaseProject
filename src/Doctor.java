import java.util.ArrayList;
import java.util.Iterator;
public class Doctor
{
	private String docID;
	private String name;		//Name of the Doctor
	private String spec; 		// Specialization of each Doctor
	private String phoneNum;	// Phone Number of Each Doctor
	public Doctor(){}
	public Doctor(String id){
		this.docID=id;
	}
	public Doctor(String id, String name){
		this.docID=id;
		this.name=name;
	}
	public Doctor(String id, String name, String spec, String phoneNum){
		this.docID=id;
		this.name=name;
		this.spec=spec;
		this.phoneNum=phoneNum;
	}
	public String getID(){
		return this.docID;
	}
	public  String getName(){
		return this.name;
	}
	public  String getSpec(){
		return this.spec;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSpec(String spec){
		this.spec=spec;
	}
	
	@Override 
	public boolean equals(Object other){
		if(!(other instanceof Doctor))
			return false;
		Doctor d1= (Doctor)other;
		return 	this.name.equals(d1.name) && this.spec.equals(d1.spec);
	}
}
