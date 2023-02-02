//William Clifford rye747
/*The Apatosaurus class extends the Sauropod class and can be used to create Dinosaur objects
 * */
public class Apatosaurus extends Sauropod{
	private String myType = "Apatosaurus";
	
	public Apatosaurus(String name, boolean isVege) {
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
