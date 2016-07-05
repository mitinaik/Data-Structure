
import java.util.*;

public class TestLinkedHashSet
{
   public static void  main(String[] args)
   {
      //cretea a linked has set
      Set<String> set = new LinkedHashSet<>();
      
      //add strings to the linked has hset
      set.add("London");
      set.add("Paris");
      set.add("New York");
      set.add("San Francisco");
      set.add("Beijing");
      set.add("New York");
      
      System.out.println(set);
      
      //display the elements in the linked hash set
      for(String element: set)
         System.out.print(element.toLowerCase() + " ");

   }
}