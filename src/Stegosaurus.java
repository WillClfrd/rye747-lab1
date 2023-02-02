//William Clifford rye747
public class Stegosaurus extends Stegosaur{
	private String myType = "Stegosaurus";
	
	public Stegosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getMyType() {
		return myType;
	}
	
	public String toString() {
		return super.getType().replace(" -", ":") + " named " + super.getName() +  " (" + super.dietType() + ")";
	}
	
	public String getSubType() {
		return getMyType();
	}
	
	public void setMyType(String newType) {
		myType = newType;
	}
}
