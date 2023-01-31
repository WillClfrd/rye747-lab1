
public abstract class Theropod implements Dinosaur{
	private String name;
	private String type = "Theropod";
	private boolean isVeg;
	
	public Theropod(String pName, boolean isVege) {
		name = pName;
		isVeg = isVege;
	}
	
	public String toString() {
		return getType() + ": " + getSubString() + " (" + dietType() + ")";
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
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
	public abstract String getSubString();
}
