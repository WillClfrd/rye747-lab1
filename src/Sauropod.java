
public abstract class Sauropod implements Dinosaur{
	private String name;
	private boolean isVeg;
	
	public Sauropod(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	public String toString() {
		return getName() + ": " + getSubType() + " named " + name + " (" + dietType() + ")";
	}
	
	public String getName() {
		return "Sauropod";
	}
	
	//getters
	public String getType() {
		return getSubType();
	}
	
	public boolean isVegetarian() {
		return isVeg;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setVeg(boolean newVeg) {
		isVeg = newVeg;
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
