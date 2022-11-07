import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {
  
  public ArrayList<String> residents;
    Boolean hasDiningRoom;
    Boolean hasElevator;
    private int activeFloor = -1; // Default value indicating we are not inside this building
    int floorNum;
  
     
  public House(String name, String address,String residents, int nFloors,boolean hasDiningRoom) {
    super(name, address,nFloors);
    this.residents=new ArrayList<String>();
  }
   
  /* Overloaded constructor with name only */
  public House(String name) {
    super(); 
    this.name = name; 
  }

  /*Overloaded constructor with name, address */
  public House(String name, String address) {
    super(name, address); 
  }

  /* manipulator to set the information of if there is a dining hall in the house */
  public void sethasDiningRoom(boolean b){
    this.hasDiningRoom = b;

  }

  /* manipulator to set the information of if there is an elevator in the house */
  public void  sethasElevator(boolean a){
    this.hasElevator = a;
  }

  /* accessor to retrieve the information of if there is a dining hall in the house */
  public boolean gethasDiningRoom(){
   return this.hasDiningRoom;
  }

  /*accesor to know the number of residents in the house */
  public int nResidents;
  public int getnResidents(){
   return residents.size();
  }
 
  public void moveIn(String Studentname){
   this.residents.add(Studentname);
   System.out.println("The student was added succesfully. Welcome to " + Studentname);
   System.out.println(this.residents);
  }

  public String moveOut(String Studentname){
   this.residents.remove(Studentname);
   System.out.println(Studentname + "Goodbye");
   return Studentname;
  }
 
  public boolean isResident(String person){
    System.out.println(this.residents.contains(person));
    return this.residents.contains(person);
  }
  
  public boolean gethasElevator(){
    return this.hasElevator;
  }
 
  public House() {
    super.enter();
    super.exit();
    //super.goToFloor(activeFloor);
    super.goDown();
    super.goUp();
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

    public void showOptions() {
     super.showOptions();     
     System.out.println( " + moveIn() \n + moveOut()   \n + isResident() " );
    }
  

  public static void main(String[] args) {
    
    //new House("Laura Scales", " 1 chapin way",3,true);
       House Laurascales = new House("Laurascales", "150 Neilson Street Northampton, MA 01063", "Joshua", 3,true );
        System.out.println(Laurascales );
    
       //To test
       System.out.println("You have built a house: 🏠");
       //Laurascales.moveIn("Glory Divine");
      // Laurascales.moveIn("Ngono Pierre");
      // Laurascales.moveOut("Glory Divine");
       Laurascales.moveIn("Christabelle");
       Laurascales.isResident("Glory Divine");
       //Laurascales.isResident("Christabelle"); 
       //Laurascales.enter();
       //Laurascales.goToFloor(2);
       //Laurascales.goDown();
      // Laurascales.exit();
      // Laurascales.showOptions();
      //System.out.println((Laurascales.gethasElevator);
      Laurascales.enter();
       Laurascales.sethasElevator(false);
       
       Laurascales.goToFloor(2);
       
       
        
  }

}