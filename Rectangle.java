
public class Rectangle extends GeometricObject
{
   private double width;
   private double length;
   
   public Rectangle()
   {
      width = length = 0.0;
   }
   public Rectangle(double width, double length)
   {
      this.width = width;
      this.length = length;
   }
   public Rectangle(double width, double length, String color, boolean filled)
   {
      this.width = width;
      this.length = length;
      setColor(color);
      setFilled(filled);
   }
   public void setWidth(double width){this.width = width;}
   public double getWidth(){return width;}
   public void setLength(double length){this.length = length;}
   public double getLength(){return length;}
   public double getArea()
   {
      return width * length;
   }
   public double getPerimeter()
   {
      return 2 * (width + length);
   }
}