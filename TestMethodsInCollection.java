
public class TestMethodsInCollection
{
   public static void main(String[] args)
   {
      //create set1
      java.util.Set<String> set1 = new java.util.HashSet<>();
      
      //add strings to set1
      set1.add("London");
      set1.add("Paris");
      set1.add("New York");
      set1.add("San Francisco");
      set1.add("Beijing");
      
      System.out.println("set1 is " + set1);
      System.out.println(set1.size() + " elements in set1");
      
      //delete a string from set1
      set1.remove("London");
      System.out.println("\nset1 is " + set1);
      System.out.println(set1.size() + " elements in set1");
      
      //create set2
      java.util.Set<String> set2 = new java.util.HashSet<>();
      set2.add("London");
      set2.add("Shanghai");
      set2.add("Paris");
      
      System.out.println("\nset2 is " + set2);
      System.out.println(set2.size() + " elements in set2");
      
      System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
      
      set1.addAll(set2);
      System.out.println("\nAfter adding set2 to set1, set1 is " + set1);
      
      set1.removeAll(set2);
      System.out.println("After removing set2 fro set1, set1 is " + set1);
      
      set1.retainAll(set2);   -  c   vv bgv 
      System.out.println("After removing common elements in set2 from set1, set1 is " + set1);
          


   }
}