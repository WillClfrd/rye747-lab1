
public class Tyrannosaurus extends Theropod{

	public Tyrannosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getType(){
		return "Tyrannosaurus";
	}
	
	public String getSubType() {
		return getType();
	}
}
