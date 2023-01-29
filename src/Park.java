
public class Park {
 private String name;
 private int maxCap;
 private Dinosaur Dinosaurs[] = new Dinosaur[maxCap];
 
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
	 if(Dinosaurs.length < maxCap) {
		 Dinosaurs[Dinosaurs.length] = dino;
	 }
	 else {
		 System.out.println("ERROR: MAX CAPACITY REACHED - Unable to add new dinosaur to " + name);
	 }
 }
 
}
