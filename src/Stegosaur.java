//William Clifford rye747
/*The Stegosaur class implements the Dinosaur interface, contains many important methods for Dinosaur objects, and can be used to instantiate Dinosaur objects
 * */
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private String type = "Stegosaur";
	private boolean isVeg;
	
	public Stegosaur(String pName, boolean isVege) {
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
