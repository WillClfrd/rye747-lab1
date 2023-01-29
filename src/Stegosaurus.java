
public class Stegosaurus extends Stegosaur{

	public Stegosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getType(){
		return "Stegosaurus";
	}
	
	public String getSubType() {
		return getType();
	}
}
