
import java.util.Map;
import java.util.TreeMap;

public class TreeMapFirstNameExample
{
   public static void main(String[] args)
   {
      //natural order
      Map<User, String> userMap = new TreeMap<>();
      User u1 = new User("Alex", "BBB", 12000);
      User u2 = new User("Robert", "DDD", 13000);
      User u3 = new User("Mike", "FFF", 14000);
      User u4 = new User("George", "HHH", 15000);
      
      
      userMap.put(u1,"Name1");
      userMap.put(u2, "Name2");
      userMap.put(u3, "Name3");
      userMap.put(u4, "Name4");
      
      System.out.println(userMap.toString()); 
   }
}