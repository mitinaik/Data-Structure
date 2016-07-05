
public class WildCardDemo
{
   public static void main(String[] args)
   {
         
      Stack<Integer> intStack = new Stack<>(10);
      intStack.push(1);
      intStack.push(2);
      intStack.push(-2);
      
      System.out.print("The max number is " + max(intStack));
   }
   //find the maximum in a stack of numbers
   //it has coompile error. intStack is not an instance of Stack<Number>.
      //you can not invoke max(intStack)
      //replace method hearder by
      public static double max(Stack<? extends Number> stack)
  // public static double max(Stack<Number> stack)
   {
      double max = stack.pop().doubleValue();
      
      while(!stack.isEmpty())
      {
         double value = stack.pop().doubleValue();
         if(value > max)
            max = value;
      }
      return max;
   }
}