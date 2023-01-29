
public class Velociraptor extends Theropod{

	public Velociraptor(String name, boolean isVege) {
		super(name, isVege);
	}	
	
	public String getType(){
		return "Velociraptor";
	}
	
	public String getSubType() {
		return getType();
	}
}
