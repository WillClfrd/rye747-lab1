
public class Apatosaurus extends Sauropod{

	public Apatosaurus(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getType(){
		return "Apatosaurus";
	}
	
	public String getSubType() {
		return getType();
	}
}
