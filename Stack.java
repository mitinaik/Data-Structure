//stack.java

class Stack<E>
{
   private int maxSize;//linked list does not need size specification
   private E[] stackArray;
   private int top;
   
   public Stack(int s)
   {
      maxSize = s;
      stackArray = (E[])new Object[maxSize];
      
      top = -1;
   }
   public void push(E j)
   {
      //if no dynamic array is used
      /*
      if(top == maxSize -1)
      {
         System.out.println("Stack overflow.");
      }
      */
      stackArray[++top] = j;
   }
   public E pop()
   {
      //if no dynamic array is used
      /*
      if(top == -1)
      {
         System.out.println("Stack is empty.");
      }
      
      */
      return stackArray[top--];
   }
   public E peek()
   {
      return stackArray[top];
   }
   public boolean isEmpty()
   {
      return (top == -1);
   }
   public boolean isFull()
   {
      return (top == maxSize - 1);
   }
}

class StackApp
{
   public static void main(String[] args)
   {
      
      Stack<Long> theStack = new Stack<>(10);
      
      theStack.push(new Long(20));
      theStack.push(new Long(40));
      theStack.push(new Long(60));
      theStack.push(new Long(80));
      
      while(!theStack.isEmpty())
      {
         Long value = theStack.pop();
         System.out.print(value+ " ");
      }
      System.out.println();
      
      
      /*
      Stack<Integer> theStack2 = new Stack<>(10);
      theStack2.push(1);
      theStack2.push(2);
      theStack2.push(3);
      while(!theStack2.isEmpty())
      {
         int value = theStack2.pop();
         System.out.print(value + " ");
      }
      System.out.println();
      
      
      Stack<String> theStack3 = new Stack<>(10);
      theStack3.push("London");
      theStack3.push("Paris");
      theStack3.push("New York");
      while(!theStack3.isEmpty())
      {
         String value = theStack3.pop();
         System.out.print(value + " ");
      }
      System.out.println();
      */
      
   }
   
}