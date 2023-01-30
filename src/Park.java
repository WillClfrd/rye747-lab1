
public class Park {
 private String name;
 private int maxCap;
 public Dinosaur dinosaurs[] = new Dinosaur[0];
 
 public Park(String pName, int mCap) {
	 name = pName;
	 maxCap = mCap;
 }
 
 public String toString() {
	 String parkStr = "Welcome to " + name + "!\n- - - - - - - - - - - - -\n";
	 int i;
	 for(i = 0; i < dinosaurs.length; ++i) {
		 parkStr += "* " + dinosaurs[i].toString() + "\n";
	 }
	 return parkStr;
 }
 
 public void addDino(Dinosaur dino) {
	 if(dinosaurs.length < maxCap) {
		 Dinosaur dinosaursCopy[] = copyDinos();
		 dinosaursCopy[dinosaurs.length] = dino;
		 dinosaurs = dinosaursCopy;
	 }
	 else {
		 System.out.println("ERROR: MAX CAPACITY REACHED - Unable to add new dinosaur to " + name + ".");
	 }
 }
 
 public Dinosaur[] copyDinos(){
	 Dinosaur tempArr[] = new Dinosaur[dinosaurs.length + 1];
	 int i;
	 
	 for(i = 0; i < dinosaurs.length; ++i) {
		 tempArr[i] = dinosaurs[i];
	 }
	 
	 return tempArr;
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