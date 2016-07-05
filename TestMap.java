import java.util.*;

public class TestMap
{
   public static void main(String[] args)
   {
      
      //create a HashMap
      Map<String, Integer> hashMap = new HashMap<>();
      
      hashMap.put("Smith", 30);
      hashMap.put("Anderson", 31);
      hashMap.put("Lewis", 29);
      hashMap.put("Cook", 29);
      
           
      System.out.println("Display entries in HashMap");
      System.out.println(hashMap + "\n");//in random order
      
      //create a TreeMap from the preceding HashMap
      Map<String, Integer> treeMap = new TreeMap<>(hashMap);
      //The entries in the TreeMap are in increasing order of the keys
      System.out.println("Display entries in ascending order of key");
      System.out.println(treeMap);
      
      
      
      
      //create a LinkedHashMap with the access order, use LinkedHashMap(initialCapacity, loadFactor, true)
      Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
      linkedHashMap.put("Smith", 30);
      linkedHashMap.put("Anderson", 31);
      linkedHashMap.put("Lewis", 29);
      linkedHashMap.put("Cook", 29);
      
      
      //display the age for Lewis
      //The entries in the linkedHashMap are in the order 
      //of their access, from least recently accessed to most recently
      System.out.println("\nThe age for " + " Lewis is " + 
               linkedHashMap.get("Lewis"));
             
      
      System.out.println("Display entries in LinkedHashMap");
      System.out.println(linkedHashMap);
      
   }
}