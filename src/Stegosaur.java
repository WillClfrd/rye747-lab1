//William Clifford rye747
/*The Stegosaur class implements the Dinosaur interface, contains many important methods for Dinosaur objects, and can be used to instantiate Dinosaur objects
 * */
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private String type = "Stegosaur";
	private boolean isVeg;
	
	/*The Stegosaur class constructor takes a String and a boolean in as parameters in order to instantiate a Stegosaur object
	 * The String parameter is used to assign the Stegosaur object's name value
	 * The boolean parameter is used to assign the Stegosaur object's isVeg value
	 * */
	public Stegosaur(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	/*The Stegosaur toString method formats the Dinosaur object properties into a String for output by calling several methods
	 * getType is called to return the Dinosaur type and subtype attributes formatted as a string
	 * getName is called to return the Dinosaur name attribute
	 * dietType is called to return whether the Dinosaur is a carnivore or not based on the value of isVeg
	 * */
	public String toString() {
		return getType().replace(" -", ":") + " named " + getName() +  " (" + dietType() + ")";
	}
	
	//getName returns the name attribute of the Dinosaur object
	public String getName() {
		return name;
	}
	
	//getType is called to return the type attribute from the Stegosaur class and the myType(Stegosaur subType) attribute from the relevant subclass
	public String getType() {
		return type + " - " + getSubType();
	}
	
	//getVeg returns the true/false value of the isVeg attribute
	public boolean getVeg() {
		return isVeg;
	}
	
	//setName is used to set the Stegosaur class name attribute to the value of newName 
	public void setName(String newName) {
		name = newName;
	}
	
	//setVeg is used to set the Stegosaur class isVeg attribute to the value of newVeg 
	public void setVeg(boolean newVeg) {
		isVeg = newVeg;
	}
	
	//setType is called to set the type attribute in the Stegosaur class to the value of newType
	public void setType(String newType) {
		type = newType;
	}
	
	//isVegetarian is used to return the value of the isVeg attribute
	public boolean isVegetarian() {
		return getVeg();
	}
	
	//dietType is called to return a string based on the value of isVeg
	public String dietType() {
		if(isVegetarian()) {
			return "not carnivore";
		}
		else {
			return "carnivore";
		}
	}
	
	//getSubType is abstractly defined in Stegosaur and is implemented in the Stegosaur subclasses
	public abstract String getSubType();
}