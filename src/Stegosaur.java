
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private boolean isVeg;
	
	public Stegosaur(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	public String toString() {
		return getName() + ": " + getSubType() + " named " + name + " (" + dietType() + ")";
	}
	
	//getters
	public String getName() {
		return "Stegosaur";
	}
	
	public String getType() {
		return getSubType();
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setVeg(boolean newVeg) {
		isVeg = newVeg;
	}
	
	public boolean isVegetarian() {
		return isVeg;
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
