//William Clifford rye747
/*The Brachiosaurus class extends the Sauropod class and can be used to create Dinosaur objects
 * */
public class Brachiosaurus extends Sauropod{
	private String myType = "Brachiosaurus";
	
	//the Brachiosaurus class constructor instantiates an object of the Brachiosaurus subclass by calling the Sauropod class constructor  
	public Brachiosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	//getMyType is used to return the myType attribute of the Brachiosaurus object
	public String getMyType() {
		return myType;
	}
	
	//the Brachiosaurus toString method calls the super class toString method in order to return relevant class data as a string for output 
	public String toString() {
		return super.toString();
	}
	
	//the getSubType method is used to return the Brachiosaurus myType attribute
	public String getSubType() {
		return getMyType();
	}
	
	//the setMyType method is used to set the value of the myType Brachiosaurus class attribute to the value of newType
	public void setMyType(String newType) {
		myType = newType;
	}
}