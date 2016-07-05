import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapSalaryExample
{
   public static void main(String[] args)
   {  
      //To use a comparator, you have to use the TreeMap(Comparator comparator) constructor to 
      //create a sorted map that uses the compare method in the comparator to order
      //the entries in the map based on the keys
      UserSalaryComparator usc = new UserSalaryComparator();
      //ordering based on Comparator on salary
      Map<User, String> userSalaryMap = new TreeMap<>(usc);
      User u1 = new User("Alex", "BBB", 21000);
      User u2 = new User("Robert", "DDD", 13000);
      User u3 = new User("Mike", "FFF", 19000);
      User u4 = new User("George", "HHH", 15000);
      
      userSalaryMap.put(u1, "Name1");
      userSalaryMap.put(u2, "Name2");
      userSalaryMap.put(u3, "Name3");
      userSalaryMap.put(u4, "name4");
      
          
     
     
      //get all entries into a set
      Set<Map.Entry<User, String>> entrySet = userSalaryMap.entrySet();
      //get key and value from each entry
      for(Map.Entry<User, String> entry: entrySet)
         System.out.println(entry.getKey() + "\t" + entry.getValue());
         
   }
}