//William Clifford rye747
/*The Park class is used to construct Park objects
 * Park objects have a name stored as a String, a maximum capacity stored as an int, and a list of Dinosaurs in the park stored as an array of Dinosaur objects
 * */
public class Park {
 private String name;
 private int maxCap;
 private Dinosaur Dinosaurs[] = new Dinosaur[0];
 
 /*The Park constructor takes a String in as the name for the park and an int as the maximum capacity for the park
  * A park object is constructed using these parameters
 */
 public Park(String pName, int mCap) {
	 name = pName;
	 maxCap = mCap;
 }
 
 /*toString formats the park information into a string by calling the getName method for the park and the Dinosaur toString method for each item in the Dinosaurs array
  * This formatted array is then returned
  * */
 public String toString() {
	 String parkStr = "Welcome to " + getName() + "!\n- - - - - - - - - - - - -\n";
	 int i;
	 for(i = 0; i < Dinosaurs.length; ++i) {
		 parkStr += "* " + Dinosaurs[i].toString() + "\n";
	 }
	 return parkStr;
 }
 
 //getName is used to return the name of the park as a String
 public String getName() {
	 return name;
 }
 
 //getMaxCap is used to return the park object's max capacity
 public int getMaxCap() {
	 return maxCap;
 }
 
 //setName is used to set the park object name to a new String that is passed in as a parameter to setName
 public void setName(String newName) {
	 name = newName;
 }
 
 //setMaxCap is used to set the park object maxCap to a new value that is passed in as a parameter to setMaxCap
 public void setMaxCap(int newMaxCap) {
	 maxCap = newMaxCap;
 }
 
 /*The addDino method takes a Dinosaur object as a parameter
  *the method then checks if dino can be added to the array
  *if dino can be added, a temp array is made so that we have an array of Dinosaur objects that is 1 larger than Dinosaurs
  *dino is inserted as the last element in the temp array, Dinosaurs is then set equal to the temp array
  *if dino cannot be added due to max capacity being reached, an error message is printed
  * */
 public void addDino(Dinosaur dino) {
	 if(Dinosaurs.length < maxCap) {
		 Dinosaur dinosaursCopy[] = copyDinos();
		 dinosaursCopy[Dinosaurs.length] = dino;
		 Dinosaurs = dinosaursCopy;
	 }
	 else {
		 System.out.println("ERROR: MAX CAPACITY REACHED - Unable to add new dinosaur to " + getName() + ".");
	 }
 }
 
 //copyDinos() takes the current Dinosaurs array and makes a temporary array one size larger, then copies Dinosaurs elements into the temp array and returns the temporary array. This is only used in addDino to resize Dinosaurs
 public Dinosaur[] copyDinos(){
	 Dinosaur tempArr[] = new Dinosaur[Dinosaurs.length + 1];
	 int i;
	 
	 for(i = 0; i < Dinosaurs.length; ++i) {
		 tempArr[i] = Dinosaurs[i];
	 }
	 
	 return tempArr;
 }
 
}