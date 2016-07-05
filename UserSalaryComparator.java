
import java.util.Comparator;

public class UserSalaryComparator implements Comparator<User>
{
   //this compares users based on salary
   public int compare(User o1, User o2)
   {
      if(o1.getSalary() >= o2.getSalary())
         return 1;
      else
         return -1;
       
   }
}