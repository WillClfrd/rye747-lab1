
public class Park {
 private String name;
 private int maxCap;
 private Dinosaur dinosaurs[] = new Dinosaur[0];
 
 public Park(String pName, int mCap) {
	 name = pName;
	 maxCap = mCap;
 }
 
 public String toString(Dinosaur dino) {
	 String parkStr = "Welcome to " + name + "!\n- - - - - - - - - - - - -\n";
	 int i;
	 for(i = 0; i < dinosaurs.length; ++i) {
		 parkStr += dinosaurs[i].toString() + "\n";
	 }
	 return parkStr;
 }
 
 public void addDino(Dinosaur dino) {
	 if(dinosaurs.length < maxCap) {
		 Dinosaur dinosaursCopy[] = new Dinosaur[dinosaurs.length + 1];
		 dinosaursCopy[dinosaurs.length] = dino;
		 dinosaurs = dinosaursCopy;
	 }
	 else {
		 System.out.println("ERROR: MAX CAPACITY REACHED - Unable to add new dinosaur to " + name);
	 }
 }
 
}
//for addDino
//create array of maxCap size
	//keep a counter to track how many objects are in the array
	//use counter to compare to maxCap and to insert new objects

//or

//create array of 0 elements
	//addDino creates a new array of dinosaurs.length + 1
		//dino is added to dinosaursCopy[dinosaursCopy.length - 1]
		//dinosaurs = dinosaursCopy