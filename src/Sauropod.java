
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
	
	public String getType() {
		return getSubType();
	}
	
	public boolean isVegetarian() {
		return isVeg;
	}
	
	public String dietType() {
		if(isVeg) {
			return "not carnivore";
		}
		else {
			return "carnivore";
		}
	}
	
	public abstract String getSubType();
}
