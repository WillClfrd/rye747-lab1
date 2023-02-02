//William Clifford rye747
/*The Dinosaur interface is used as a template to declare methods for use in the Sauropod, Theropod, and Stegosaur classes and their subclasses
 * */
public interface Dinosaur {
	//the toString method will return a formatted String that will contain the information for a Dinosaur object
	public abstract String toString();
	
	//the isVegetarian method will return a boolean value of true if the Dinosaur object has an isVeg value of true and false otherwise
	public abstract boolean isVegetarian();
	
	//getName will return the name value of the Dinosaur object
	public abstract String getName();
	
	//the getType method will return the type value of the Dinosaur object
	public abstract String getType();
	
}