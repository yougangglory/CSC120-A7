import java.util.Hashtable;

/* This is a stub for the Library class */
  public class Library extends Building {
    Hashtable<String,Boolean> HashTable = new Hashtable <>(); 
    Boolean hasElevator;
    
    public Library(String name, String address,int nFloors) {
      super( name,address,nFloors);
     Hashtable<String,Boolean> HashTable = new Hashtable <>(); 
      
      //System.out.println("You have built a library: 📖");
    }

    /* Overloaded constructor with name only */
    public Library(String name) {
      super(); 
      this.name = name; 
    }

    /*Overloaded constructor with name, address */
    public Library(String name, String address) {
     super(name, address); 
    }
   
    /* manipulator to set the information of if there is an elevator in the library */
    public void  sethasElevator(boolean a){
     this.hasElevator = a;
    }

    public void addTitle(String title){
      HashTable.put(title,true);
      System.out.println("succesfully added");
      
    }

    public String removeTitle(String title){
     HashTable.remove(title, true);
     System.out.println(title + "removed succesfully");//for testing
     return title;
    }

    public void checkOut(String title){
     HashTable.replace(title, true, false);
     System.out.println("checkout done"); //for testing
    }

    public void Return(String title){
     HashTable.replace(title, false, true);
     System.out.println("return succesful"); //for testing
    }

    public Boolean containsTitle(String title){
      //System.out.println(HashTable.containsKey(title));
      return HashTable.containsKey(title);     
    }

    public boolean isAvailable(String title){
     //System.out.println(HashTable.get(title));
     return HashTable.get(title);
     
    }

    public void printCollection(){
     System.out.println(HashTable);
    }

    private int activeFloor = -1; // Default value indicating we are not inside this building
    public Library() {
      super.enter();
      super.exit();
      super.goToFloor(activeFloor);
      super.goDown();
      super.goUp();
    }

    public boolean gethasElevator(){
     return this.hasElevator;
    }
 
    public void showOptions() {
     super.showOptions();     
     System.out.println( " + isAvailable() \n + printCollection()   \n + containsTitle () \n + Return()  \n + checkOut()  \n + removeTitle()  \n + addTitle()   " );
     }

    /*test first if there is an elevator and if yes use it to go the floor requested */
    public void goToFloor(int activeFloor){
      if (this.hasElevator == true){
       System.out.println("You can use the elevator!");
       super.goToFloor(activeFloor);
      }
      else{
        System.out.println("Sorry. This building don't have an elevator. Please use the stairs");
      }

    }
    public static void main(String[] args) {
      Library Neilson = new Library("Neilson library","200 Street drive 1 chapin way",4);
    System.out.println(Neilson);
    // For testing the methods
   /*  Neilson.addTitle("redeemer");
    Neilson.addTitle("beautiful");
    Neilson.removeTitle("beautiful");
    Neilson.addTitle("nicer");
    Neilson.checkOut("redeemer");
    Neilson.Return("redeemer");
    Neilson.checkOut("nicer");
    Neilson.containsTitle("beautiful");
    Neilson.containsTitle("nicer");
    System.out.println(Neilson.isAvailable("nicer"));
    System.out.println( Neilson.isAvailable("redeemer"));
    Neilson.printCollection();
    Neilson.enter();
    Neilson.sethasElevator(true);
    Neilson.goToFloor(3);
    Neilson.showOptions();*/
    
  }
  
}