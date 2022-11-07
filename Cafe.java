<<<<<<< HEAD
import java.util.jar.Attributes.Name;

import javax.xml.stream.events.Namespace;

/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int activeFloor = -1; // Default value indicating we are not inside this building
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    Boolean hasElevator;
    public Cafe(String name, String adress, int nFloors) {
        super(name, adress, nFloors);
        this.nCoffeeOunces=50;
        this.nSugarPackets=50;
        this.nCreams=50;
        this.nCups=10;

        System.out.println("You have built a cafe: ☕");
    }
 
    /* Overloaded constructor with name only */
    public Cafe(String name) {
        super(); 
        this.name = name; 
    }

    /* Overloaded constructor with name, address */
    public Cafe(String name, String address) {
        super(name, address); 
    }

    /* accessor to retrieve the information of if thenumber of floors */
    public int getFloors() {
        return this.nFloors;
    }
   
    /* manipulator to set the information of if there is an elevator in the house */
    public void  sethasElevator(boolean a){
     this.hasElevator = a;
    }
       
    public void showOptions() {
     super.showOptions();     
     System.out.println( " + sellCofee() " );
    }

    /*test first if there is an elevator and if yes use it to go the floor requested */
    public void goToFloor(int activeFloor){
        if (this.hasElevator == true && (activeFloor < 2)){
         System.out.println("There is an elevator!");
         super.goToFloor(activeFloor);
        }
        else{
          System.out.println("Sorry. This building don't have an elevator or you are only permitted to be on the groundfloor and first floor");
        }  
    }
    
        public Cafe() {
         super.enter();
         super.exit();
         super.goToFloor(activeFloor);
         super.goDown();
        }
     
     
        private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {}

        public void sellCoffee(int numberCoffee, int numberSugar, int numberCream){
            if (numberCoffee >= nCoffeeOunces || numberSugar >= nSugarPackets || numberCream >= nCreams){
              restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);{
                 this.nCoffeeOunces= nCoffeeOunces+100;
                 this.nSugarPackets=nSugarPackets+100;
                 this.nCreams=nCreams+100;
                 this.nCups=nCups+5;
                 System.out.println("Stock done");
                }
            }
      
         System.out.println("cofee"+ nCoffeeOunces + "Sugar"+nSugarPackets+ "cream" + nCreams+ "cup"+ nCups);
         nCoffeeOunces = nCoffeeOunces-numberCoffee;
         nSugarPackets= nSugarPackets-numberSugar;
         nCreams=nCreams-numberCream;
         nCups=nCups-1;
         System.out.println("remain " + nCoffeeOunces);
         System.out.println("remain "+ nCreams);
         System.out.println("the remaining cups are " + nCups);
         System.out.println("It is done! Your cafe is done");
        
        }
    

    public static void main(String[] args) {
       Cafe SmithCafe= new Cafe("SmithCafe","100 Elm street");
       System.out.println(SmithCafe);
      //SmithCafe.sellCoffee(20, 0, 6);
      //SmithCafe.sellCoffee(100, 5, 3);
      SmithCafe.enter();
      SmithCafe.sethasElevator(true);  
       SmithCafe.goToFloor(1);
      SmithCafe.exit();
      SmithCafe.showOptions();
    }
    
}
=======
import java.util.jar.Attributes.Name;

import javax.xml.stream.events.Namespace;

/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int activeFloor = -1; // Default value indicating we are not inside this building
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    Boolean hasElevator;
    public Cafe(String name, String adress, int nFloors) {
        super(name, adress, nFloors);
        this.nCoffeeOunces=50;
        this.nSugarPackets=50;
        this.nCreams=50;
        this.nCups=10;

        System.out.println("You have built a cafe: ☕");
    }
 
    /* Overloaded constructor with name only */
    public Cafe(String name) {
        super(); 
        this.name = name; 
    }

    /* Overloaded constructor with name, address */
    public Cafe(String name, String address) {
        super(name, address); 
    }

    /* accessor to retrieve the information of if thenumber of floors */
    public int getFloors() {
        return this.nFloors;
    }
   
    /* manipulator to set the information of if there is an elevator in the house */
    public void  sethasElevator(boolean a){
     this.hasElevator = a;
    }
       
    public void showOptions() {
     super.showOptions();     
     System.out.println( " + sellCofee() " );
    }

    /*test first if there is an elevator and if yes use it to go the floor requested */
    public void goToFloor(int activeFloor){
        if (this.hasElevator == true && (activeFloor < 2)){
         System.out.println("There is an elevator!");
         super.goToFloor(activeFloor);
        }
        else{
          System.out.println("Sorry. This building don't have an elevator or you are only permitted to be on the groundfloor and first floor");
        }  
    }
    
        public Cafe() {
         super.enter();
         super.exit();
         super.goToFloor(activeFloor);
         super.goDown();
        }
     
     
        private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {}

        public void sellCoffee(int numberCoffee, int numberSugar, int numberCream){
            if (numberCoffee >= nCoffeeOunces || numberSugar >= nSugarPackets || numberCream >= nCreams){
              restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);{
                 this.nCoffeeOunces= nCoffeeOunces+100;
                 this.nSugarPackets=nSugarPackets+100;
                 this.nCreams=nCreams+100;
                 this.nCups=nCups+5;
                 System.out.println("Stock done");
                }
            }
      
         System.out.println("cofee"+ nCoffeeOunces + "Sugar"+nSugarPackets+ "cream" + nCreams+ "cup"+ nCups);
         nCoffeeOunces = nCoffeeOunces-numberCoffee;
         nSugarPackets= nSugarPackets-numberSugar;
         nCreams=nCreams-numberCream;
         nCups=nCups-1;
         System.out.println("remain " + nCoffeeOunces);
         System.out.println("remain "+ nCreams);
         System.out.println("the remaining cups are " + nCups);
         System.out.println("It is done! Your cafe is done");
        
        }
    

    public static void main(String[] args) {
       Cafe SmithCafe= new Cafe("SmithCafe","100 Elm street");
       System.out.println(SmithCafe);
      // SmithCafe.sellCoffee(20, 0, 6);
      // SmithCafe.sellCoffee(100, 5, 3);
      SmithCafe.enter();
      SmithCafe.sethasElevator(true);  
       SmithCafe.goToFloor(1);
      SmithCafe.exit();
      SmithCafe.showOptions();
    }
    
}
>>>>>>> b7429bee6619dcc4835d9275cabbd6a36e6487d6
