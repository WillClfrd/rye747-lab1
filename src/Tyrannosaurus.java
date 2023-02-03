//William Clifford rye747
/*The Tyrannosaurus class extends the Theropod class and can be used to create Dinosaur objects
 * */
public class Tyrannosaurus extends Theropod{
	private String myType = "Tyrannosaurus";
	
	//the Tyrannosaurus class constructor instantiates an object of the Tyrannosaurus subclass by calling the Theropod class constructor  
	public Tyrannosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	//getMyType is used to return the myType attribute of the Tyrannosaurus object
	public String getMyType() {
		return myType;
	}
	
	//the Tyrannosaurus toString method calls the super class toString method in order to return relevant class data as a string for output 
	public String toString() {
		return super.toString();
	}
	
	//the getSubType method is used to return the Tyrannosaurus myType attribute
	public String getSubType() {
		return getMyType();
	}
	
	//the setMyType method is used to set the value of the myType Tyrannosaurus class attribute to the value of newType
	public void setMyType(String newType) {
		myType = newType;
	}
}
