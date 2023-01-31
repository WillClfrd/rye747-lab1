
public class Tyrannosaurus extends Theropod{
	private String myType = "Tyrannosaurus";

	public Tyrannosaurus(String name, boolean isVege) {
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
