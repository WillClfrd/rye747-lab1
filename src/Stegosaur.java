
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private String type = "Stegosaur";
	private boolean isVeg;
	
	public Stegosaur(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	public String toString() {
		return getType() + " named " + getName() + " (" + dietType() + ")";
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type + ": " + getSubType();
	}
	
	public boolean getVeg() {
		return isVeg;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	
	public void setVeg(boolean newVeg) {
		isVeg = newVeg;
	}
	
	public void setType(String newType) {
		type = newType;
	}
	
	//misc methods
	public boolean isVegetarian() {
		return getVeg();
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
