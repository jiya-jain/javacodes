package HashMap;
import java.util.*;

public class Hashmap {
    //key-value pairs ; key:unique
    //time complexity : O(1)
    public static void main(String[] args) {  
     //country(key), population(value)    
        HashMap<String , Integer> map = new HashMap<>();       //initialise
       
        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        //searching
        if(map.containsKey("pak")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(map);

        //get value
        map.get("China");

        //Iteration; second method of using for loop
        //for(int val : arr)
       for( Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
       }
        //second method
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + map.get(key));
        }
        
        //delete key
        map.remove("China");//key
    }
}
