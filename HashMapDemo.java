import java.util.*;

public class HashMapDemo 
{ 
   public static void main(String args[]) 
   { 
         // create hash map 
         HashMap<Integer, String> newmap = new HashMap<>(); 
         // populate hash map 
         //put(K key, V value) method adds an entry for the specified
         //key and value in the map.
         newmap.put(1, "CS 335"); 
         newmap.put(2, "class"); 
         newmap.put(3, "is best"); 
         System.out.println("Map value before change: "+ newmap); 
         
         // put new values at key 3 
         //if the map formerly contained an entry for this key,
         //the old value is replaced by the new value and the old
         //value associated with the key is returned.

         String prevValue = newmap.put(3,"is great"); 
         // check returned previous value 
         System.out.println("Returned previous value: "+ prevValue); 
         System.out.println("Map value after change: "+ newmap); 
     } 
  }