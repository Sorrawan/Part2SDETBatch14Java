package class29;

import java.util.LinkedHashMap;

public class Hw1MapOfaBuilding {
    public static void main(String[] args) {
        /* Create a map of a building.
       Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.
      - Check how many entries you have?

      Update company on a 4th floor.
       Remove company on the 7th floor.
       Print your map.
     */
        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(2,"Syntax");
        building.put(3,"Tesla");
        building.put(4,"Twitter");
        building.put(5,"Tiktok");
        building.put(6,"Apple");
        building.put(7,"Amazon");

        System.out.println("Number of entry "+building.size());
        System.out.println(building);


    }
}

