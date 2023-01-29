
public class Park {
 private String name;
 private int maxCap;
 private Dinosaur Dinosaurs[];
 
 public Park(String pName, int mCap) {
	 name = pName;
	 maxCap = mCap;
 }
 
 public String toString(Dinosaur dino) {
	 String parkStr = "Welcome to " + name + "!\n- - - - - - - - - - - - -\n";
	 int i;
	 for(i = 0; i < Dinosaurs.length; ++i) {
		 parkStr += Dinosaurs[i].toString() + "\n";
	 }
	 return parkStr;
 }
 
 public void addDino(Dinosaur dino) {
	 //presumably adds the parameter object to Dinosaurs[]
 }
 
}
