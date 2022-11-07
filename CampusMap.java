
import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
        buildings.ensureCapacity(10);
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }
    

    
    public static void main(String[] args) {
        
        CampusMap myMap = new CampusMap();
        myMap.buildings.ensureCapacity(10);// modify the campus map to include at least 10 Buildings (or Building subclasses)
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Laura Scales House","100 Elm street"));
        myMap.addBuilding(new Cafe("Smithcafe","150 Elm street"));
        myMap.addBuilding(new Library("Neilson Library", " 100 Neilson road street",3));
        myMap.addBuilding(new Building("Wright hall"," 100 Neilson drive "));
        myMap.addBuilding(new House("king house","100 Elm Street"));
        myMap.addBuilding(new Cafe("Campus Cafe", " 200 Elm Street campus center"));
        myMap.addBuilding(new House("Morrow house"," 170 alyn drive street"));
        myMap.addBuilding(new House("Wilder houses","130 street wright"));        
        System.out.println(myMap);
    }
    
}
