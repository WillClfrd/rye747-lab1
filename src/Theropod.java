
public abstract class Theropod implements Dinosaur{
	private String name;
	private boolean isVeg;
	
	public Theropod(String name, boolean isVege) {
		
	}
	
	public String toString() {
		return "Dinosaur";
	}
	
	public String getName() {
		return "Dino";
	}
	
	public String getType() {
		return getSubType();
	}
	
	public boolean isVegetarian() {
		return isVeg;
	}
	
	public abstract String getSubType();
}
