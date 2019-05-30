import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arraysMaps {

    public static void main (String[] args) {
        /* manual array */
        int[] primeNumbers = {2,3,4,5,6,11};
        System.out.println(primeNumbers.length);
        //CREATING A LIST
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(11);
        list.get(0); // returns 2
        list.remove(0);
        System.out.println(list.toString());

        //COUNTRY LIST
        List countries = new ArrayList();
        countries.add("United Kingdom");
        countries.add("USA");
        countries.add("Italy");
        countries.remove(2); //REMOVES ITALY
        System.out.println("All Countries: " + countries.toString());
        countries.add("Singapore");
        System.out.println("All Countries: " + countries.toString());


        //Maps
        Map map = new HashMap();
        map.put("father", "Charles");
        map.put("son", "william");
        map.put("grandson","louis");
        System.out.println(map.get("grandson"));
        System.out.println(map.size());
    }
}
