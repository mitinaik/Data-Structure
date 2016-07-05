import java.util.Map;
import java.util.TreeMap;
//import java.util.HashMap;

public class JavaTreeMapExample
{
   public static void main(String[] args)
   {
      Map<Integer, String> integerMap = new TreeMap<Integer, String>();
      integerMap.put(3, "ABC");
      integerMap.put(2, "PQR");
      integerMap.put(4, "XXX");
      integerMap.put(1, "YYY");
      
      System.out.println(integerMap.toString());
   }
}