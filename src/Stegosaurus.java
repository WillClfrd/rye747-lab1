//William Clifford rye747
/*The Stegosaurus class extends the Stegosaur class and can be used to create Dinosaur objects
 * */
public class Stegosaurus extends Stegosaur{
	private String myType = "Stegosaurus";
	
	//the Stegosaurus class constructor instantiates an object of the Stegosaurus subclass by calling the Stegosaur class constructor  
	public Stegosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	//getMyType is used to return the myType attribute of the Stegosaurus object
	public String getMyType() {
		return myType;
	}
	
	//the Stegosaurus toString method calls the super class toString method in order to return relevant class data as a string for output 
	public String toString() {
		return super.toString();
	}
	
	//the getSubType method is used to return the Stegosaurus myType attribute
	public String getSubType() {
		return getMyType();
	}
	
	//the setMyType method is used to set the value of the myType Stegosaurus class attribute to the value of newType
	public void setMyType(String newType) {
		myType = newType;
	}
}