//Miti Naik
//doubbly linked list
class Node
{
employee e1;
public Node next;
public Node previous;
   public Node(employee e)
   {
   this.e1 = e;
   }
   public void displayNode()
   {
   System.out.println(" (" + e1 + " )" + "\n");
   }
}
class doublyLinkedList
{
private Node first1;
private Node last1;
private employee e1;
   public doublyLinkedList()
   {
   first1 = null;
   last1 = null;
   }
   public boolean isEmpty()
   { 
   return first1 == null;
   
   }
   public void insertFirst(employee e)
   {
   Node newNode = new Node(e);
   if (isEmpty())
      last1 = newNode;
      else 
      first1.previous = newNode;
      newNode.next = first1;
      first1 =  newNode;
    }
    public void insertLast(employee e)
    {
    Node newNode = new Node(e);
    if (isEmpty())
    first1 = newNode;
    else
    {
      last1.next = newNode;
      newNode.previous = last1;
    }
   last1 = newNode;
     }
   public  Node deleteFirst()
   {
      Node temp = first1;
      if (first1.next == null)
      last1 = null;
      else 
     first1.next.previous = null;
      first1 = first1.previous;
      return temp;
      
   
   }
   public Node deleteLast()
   {
   Node temp = last1;
   if(first1.next == null)
   first1 =null;
   else
   last1.previous.next = null;
   last1 =last1.previous;
   return temp;
   }
   public boolean insertAfter(employee e, employee key)
   {
      Node current = first1;
      while(current.e1 != key)
      {
         current = current.next;
         if(current == null)
            return false;
      }
      Node newNode = new Node(e);
      if (current == last1)
      {
      newNode.next = last1;
      last1 = newNode;
      
      }
      else 
     {
      newNode.next = current.next;
      current.next.previous = newNode;
     }
     newNode.previous = current;
      current.next = newNode;
      return true;

   }
   public Node deletekey(employee key)
   {
   Node current = first1;
         while(current.e1 != key)
      {
         current = current.next;
         if(current == null)
            return null;
      }
      if (current == first1)
      first1 = current.next;
      else
      current.previous.next= current.next;
      return current;
   }
   public void displayForward()
   {
      System.out.print("List (first -->last): ");
    Node current = first1;
      while(current != null)
      {
         current.displayNode();
         current = current.next;
      }
      System.out.println(" ");
   }
public void displayBackward()
   {
      System.out.print("List (first -->last): ");
      Node current = last1;
      while(current != null)
      {
         current.displayNode();
         current = current.previous;
      }
      System.out.println(" ");
   }
   }
   class doublylinkedlistapp
   {
      public static void main(String[] args)
      {
         doublyLinkedList thelist = new doublyLinkedList();
         employee Miti = new employee(" Miti", "1234",200.00, 200.00);
         employee jenny = new employee ("jenny", "1234", 300.00,400.00);
         employee john = new employee ("john", "1234", 350.00, 450.00);
         employee marry = new employee ("marry", "1234", 450.00, 350.00);
         
         thelist.insertFirst(Miti);
         thelist.insertAfter(jenny, Miti);
         thelist.insertLast(marry);
         thelist.insertLast(john);
         thelist.displayForward();
         
         thelist.displayBackward();
         
         thelist.deletekey(marry);
         thelist.deleteLast();
         thelist.deleteFirst();
      }
  }
         
         
