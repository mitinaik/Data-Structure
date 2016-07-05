
import java.util.Date;

public abstract class GeometricObject
{
   private String color = "white";
   private boolean filled;
   private Date dateCreated;
   
   protected GeometricObject()
   {
      dateCreated = new Date();
   }
   protected GeometricObject(String color, boolean filled)
   {
      dateCreated = new Date();
      this.color = color;
      this.filled = filled;  
   }
   public void setColor(String color)
   {  this.color = color;}
   public String getColor()
   {  return color; }
   public void setFilled(boolean filled)
   {  this.filled = filled;}
   public Date getDateCreated()
   {
      return dateCreated;
   }
   public String toString()
   {
      return "created on " + dateCreated + "\ncolor: " + color +
               " and filled: " + filled;
   }
   public abstract double getArea();
   public abstract double getPerimeter();
}