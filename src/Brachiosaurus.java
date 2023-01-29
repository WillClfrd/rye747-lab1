
public class Brachiosaurus extends Sauropod{

	public Brachiosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getType(){
		return "Brachiosaurus";
	}
	
	public String getSubType() {
		return getType();
	}
}
