
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private boolean isVeg;
	
	public String toString() {
		return "Dinosaur";
	}
	
	public String getType() {
		return getSubType();
	}
	
	public abstract String getSubType();
}
