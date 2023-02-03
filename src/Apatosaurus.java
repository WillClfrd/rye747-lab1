//William Clifford rye747
/*The Apatosaurus class extends the Sauropod class and can be used to create Dinosaur objects
 * */
public class Apatosaurus extends Sauropod{
	private String myType = "Apatosaurus";
	
	//the Apatosaurus class constructor instantiates an object of the Apatosaurus subclass by calling the Sauropod class constructor  
	public Apatosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	//getMyType is used to return the myType attribute of the Apatosaurus object
	public String getMyType() {
		return myType;
	}
	
	//the Apatosaurus toString method calls the super class toString method in order to return relevant class data as a string for output 
	public String toString() {
		return super.toString();
	}
	
	//the getSubType method is used to return the Apatosaurus myType attribute
	public String getSubType() {
		return getMyType();
	}
	
	//the setMyType method is used to set the value of the myType Apatosaurus class attribute to the value of newType
	public void setMyType(String newType) {
		myType = newType;
	}
}
