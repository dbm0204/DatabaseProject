public class Contact{
	private String name;
	private String number;
	public Contact(){}
	public Contact(String name){
		this.name=name;
	}
	public Contact(String name, String number){
		this.name=name;
		this.number=number;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getNumber(){
		return this.number;
	}
	public void setNumber(String number){
		this.number=number;
	}
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Contact)){
			return false;
		}
		Contact that = (Contact) other;
		return this.name.equals(that.name);
	}
	
	@Override
	public String toString(){
		return String.format(this.getName()+"");
	}
}
			
	
