//William Clifford rye747
/*The Velociraptor class extends the Theropod class and can be used to create Dinosaur objects
 * */
public class Velociraptor extends Theropod{
	private String myType = "Velociraptor";
	
	//the Velociraptor class constructor instantiates an object of the Velociraptor subclass by calling the Theropod class constructor  
	public Velociraptor(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	//getMyType is used to return the myType attribute of the Velociraptor object
	public String getMyType() {
		return myType;
	}
	
	//the Velociraptor toString method calls the super class toString method in order to return relevant class data as a string for output 
	public String toString() {
		return super.toString();
	}
	
	//the getSubType method is used to return the Velociraptor myType attribute
	public String getSubType() {
		return getMyType();
	}
	
	//the setMyType method is used to set the value of the myType Velociraptor class attribute to the value of newType
	public void setMyType(String newType) {
		myType = newType;
	}
}