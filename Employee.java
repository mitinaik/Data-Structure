//Veronica

import java.util.Arrays;

public class Employee implements Comparable<Employee>
{
   private int id;
   private String name;
   private int age;
   private long salary;
   
   public Employee(int id, String name, int age, int salary)
   {
      this.id = id;
      this.name = name;
      this.age = age;
      this.salary = salary;
   }
   public int getId(){return id;}
   public String getName(){return name;}
   public int getAge(){return age;}
   public long getSalary(){return salary;}
   
   //override Comparable compareTo() method
   public int compareTo(Employee emp)
   {
      //let's sort employee based on id in ascending order
      //returns a negative integer, zero, or a positive 
      //integer as this employee id
      //is less than, equal to, or greater than the 
      //specified object. 
      return (this.id - emp.id);
   }
   
   public String toString()
   {
      //this is required to print the user friendly information
      //about the employee
      return "[id=" + this.id + ", name=" + this.name
            + ", age=" + this.age + ", salary=" + this.salary+"]";
   }
   
   public static void main(String[] args)
   {
      //sort reference type object
      Employee[] empArr = new Employee[4];
      empArr[0] = new Employee(10, "Mike", 25, 10000);
      empArr[1] = new Employee(20, "Arthur", 29, 20000);
      empArr[2] = new Employee(5, "Lisa", 35, 5000);
      empArr[3] = new Employee(1, "Pat", 32, 50000);
      
      //Employee array is sorted by id in ascending order
      Arrays.sort(empArr);
      System.out.println("Sorting employee list:\n" + Arrays.toString(empArr));
      
      System.out.println("Max object is " + max(empArr[0], empArr[1]));//after sorting, id 5 is max
      //System.out.println("Max object is " + max(empArr[0], 23));//works with raw type
   } 
   /*
   public static Comparable max(Comparable o1, Comparable o2)
   {
      if(o1.compareTo(o2) > 0)
         return o1;
      else
         return o2;
   }
   */
   //a better way to write the max method is to use a generic type
   
   public static <E extends Comparable<E>> E max(E o1, E o2)
   {
      if(o1.compareTo(o2) > 0)
         return o1;
      else
         return o2;
   }
   
}