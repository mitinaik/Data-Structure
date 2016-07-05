//Name Veronica

public class Student
{
   private String firstName;
   private String lastName;
   private Address homeAddress;
   private Address schoolAddress;
   
   Student(String fName, String lName, Address home, Address school)
   {
      firstName = fName;
      lastName = lName;
      homeAddress = home;
      schoolAddress = school;
   }
   public String toString()
   {
      String str;
      str = firstName + " " + lastName + "\nHome address " + homeAddress
         + "\nSchool address " + schoolAddress;
      
      return str;
   }
   public static void main(String[] args)
   {
      Address home = new Address("Clifton", "NJ", "07105", "USA");
      Address school = new Address("Newark", "NJ", "07102", "USA");
      
      Student John = new Student("John", "Smith", home, school);
      Student Mike = new Student("Mike", "Schmidt", home, school);
      
      System.out.println(John);
      System.out.println();
      System.out.println(Mike);
   }

}