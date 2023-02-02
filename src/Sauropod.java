//William Clifford rye747
/*The Sauropod class implements the Dinosaur interface, contains many important methods for Dinosaur objects, and can be used to instantiate Dinosaur objects
 * */
public abstract class Sauropod implements Dinosaur{
	private String name;
	private String type = "Sauropod";
	private boolean isVeg;
	
	/*The Sauropod class constructor takes a Styring and a boolean in as parameters in order to instantiate a Sauropod object
	 * The String parameter is used to assign the Sauropod object's name value
	 * The boolean parameter is used to assign the Sauropod object's isVeg value
	 * */
	public Sauropod(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	public String toString() {
		return getType().replace(" -", ":") + " named " + getName() +  " (" + dietType() + ")";
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type + " - " + getSubType();
	}
	
	public boolean getVeg() {
		return isVeg;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setVeg(boolean newVeg) {
		isVeg = newVeg;
	}
	
	public void setType(String newType) {
		type = newType;
	}
	
	//misc methods
	public boolean isVegetarian() {
		return getVeg();
	}
	
	
	public String dietType() {
		if(isVegetarian()) {
			return "not carnivore";
		}
		else {
			return "carnivore";
		}
	}
	
	public abstract String getSubType();
}
