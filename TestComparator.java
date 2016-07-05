

import java.util.Comparator;

public class TestComparator
{
   public static void main(String[] args)
   {
           
      GeometricObject g1 = new Rectangle(5, 5);
      GeometricObject g2 = new Circle(5);
      
      GeometricObjectComparator GOC = new GeometricObjectComparator();
      
      System.out.println("April 6th, 2016 " + GOC.compare(g1, g2));
      
      GeometricObjectComparator goc = new GeometricObjectComparator();
      
      GeometricObject g = max(g1, g2, goc);
      
      System.out.println("The area of the larger object is " + g.getArea());
      
   }
   public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c)
   {
      if(c.compare(g1, g2) > 0)
         return g1;
      else 
         return g2;
   }
}