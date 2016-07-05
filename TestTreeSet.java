
import java.util.*;

public class TestTreeSet
{
   public static void main(String[] args)
   {
      //create a hash set
      Set<String> set = new HashSet<>();
      
      //add strings to the set
      set.add("London");
      set.add("Paris");
      set.add("New York");
      set.add("San Francisco");
      set.add("Beijing");
      set.add("New York");
      
      TreeSet<String> treeSet = new TreeSet<>(set);
      System.out.println("Sorted tree set: " + treeSet);
      
      //use the methods in SortedSet interface
      System.out.println("first(): " + treeSet.first());
      System.out.println("last(): " + treeSet.last());
      System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
      System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));
      
      //use the methods in NavigableSet interface
      System.out.println("lower(\"P\"): " + treeSet.lower("P"));//less than
      System.out.println("higer(\"P\"): " + treeSet.higher("P"));//greater than
      System.out.println("floor(\"P\"): " + treeSet.floor("P"));//less than or equal
      System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
      System.out.println("pollFirst(): " + treeSet.pollFirst());
      System.out.println("pollLast(): " + treeSet.pollLast());   
      System.out.println("New tree set: " + treeSet);
   }
}