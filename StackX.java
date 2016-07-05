//brackets.java
import java.io.*;
import java.util.Scanner;

class StackX
{
   private int maxSize;
   private char[] stackArray;
   private int top;
   
   public StackX(int s)
   {
      maxSize = s;
      stackArray = new char[maxSize];
      top = -1;
   }
   public void push(char j)
   {
      stackArray[++top] = j;
   }
   public char pop()
   {
      return stackArray[top--];
   }
   public char peek()
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
class BracketChecker
{
   private String input;
   
   public BracketChecker(String in)
   {
      input = in;
   } 
   public void check()
   {
      int stackSize = input.length(); //get max stack size
      StackX theStack = new StackX(stackSize);
      
      for(int j = 0; j < input.length(); j++)
      {
         char ch = input.charAt(j);
         switch(ch)
         {
            case '{': case '[': case '(':
                  theStack.push(ch);
                  break;
                  
            case '}': case ']': case ')':
                  if(!theStack.isEmpty())
                  {
                        char chx = theStack.pop(); //pop and check
                        if( (ch == '}' && chx != '{') ||
                            (ch == ']' && chx != '[') ||
                            (ch == ')' && chx != '(') )
                           {
                              System.out.println("Error: " + ch + " at " + j);
                              System.out.println("ch is " + ch + " and chx is " + chx);
                           }
                  }
                  else  //prematurely empty
                     System.out.println("Error 2: " + ch + " at " + j);
                  break;
             default: // no action on other characters
                  break;
         }//end switch
      }//end for
      
      if(!theStack.isEmpty())
         System.out.println("Error: missing right delimiter");
   }     
}

class BracketsApp
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);  
      String inputString;
      
      Boolean status = true;
      while(status)
      {
         System.out.print("Enter a string containing delimiters:  ");
         inputString = input.nextLine();
         
         System.out.println("The string input is " + inputString);
         
         if(inputString.equals(""))
         {  System.out.println("You entered nothing. Bye.");
            status = false;
            //break;
         }         
         BracketChecker theChecker = new BracketChecker(inputString);
         theChecker.check();
       }
   }
}