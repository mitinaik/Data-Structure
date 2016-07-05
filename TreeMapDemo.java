import java.util.*;

public class TreeMapDemo 
{ 
   public static void main(String args[]) 
   { 
      //TreeMap in Java using natural ordering of keys
      //If you create a TreeMap using its no-arg constructor, the compareTo
      //method in the Comparable interface is used to compare the keys in the 
      //map, assuming that the class for the keys implements the Comparable 
      //interface.
      Map<String, String> naturalOrderMap = new TreeMap<>();
      naturalOrderMap.put("Fixed Income", "Fixed income is related to bonds, Fixed Deposit, Swaps etc"); 
      naturalOrderMap.put("Equity", "Equity is related to Stock trading in Cash also called Cash Equity"); 
      naturalOrderMap.put("Derivative", "Derivative is mostly futures, options trading "); 
      naturalOrderMap.put("Foriegn Exchange", "FX is converting currency from one to other e.g. USD to YEN");
      
      //System.out.println(naturalOrderMap);
      
      //Map.Entry is an object that represents one entry in a map. 
      //(A standard map has 1 value for every 1 key.) 
      //So, this code will iterator over all key-value pairs.   
      //The entrySet() method returns a set of entries. 
      //The entries are instances of the Map.Entry<K, V> interface.    
      for (Map.Entry<String, String> entry : naturalOrderMap.entrySet()) 
      { 
         //retrieve object from TreeMap
         String key = entry.getKey(); //getKey method returns the key from the entry
         String value = entry.getValue(); //returns the value from this entry
         System.out.printf("%-20s  %s\n", key, value); 
      }
      
      
      //clear() will remove all entries from TreeMap and make it empty. 
      naturalOrderMap.clear();

   }
}