
public class User implements Comparable<User>

{
   private String firstName;
   private String lastName;
   private double salary;
   
   public User(String firstName, String lastName, int salary)
   {
      
      this.firstName = firstName;
      this.lastName= lastName;
      this.salary = salary;
   }
   public String getFirstName() { return firstName;}
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   public String getLastName() { return lastName;}
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   public double getSalary() {return salary;}
   
   public void setSalary(double salary)
   {
      this.salary =  salary;
   }
   public String toString()
   {
      return firstName + " " + lastName + " " + salary;
   }
   public int compareTo(User o)
   {
      return this.firstName.compareTo(o.firstName);
   }
      
}