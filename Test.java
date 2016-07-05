import java.util.*;
public class Test
{
   public static void main(String[] args)
   {
   Map <String, String> map = new LinkedHashMap<>();
   map.put("124","john");
   map.put("111","george");
   map.put("123", "steve");
   map.put("222", "stevve");
   System.out.println("1" + map);
   System.out.println("/2" + new TreeMap(map));
   }
   }