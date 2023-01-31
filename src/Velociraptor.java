
public class Velociraptor extends Theropod{
	private String myType = "Velociraptor";

	public Velociraptor(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getMyType() {
		return myType;
	}
	
	public String getSubString() {
		return getMyType() + " named " + getName();
	}
	
	public String getSubType() {
		return getMyType();
	}
	
	public void setMyType(String newType) {
		myType = newType;
	}
}
