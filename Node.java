//Miti Naik
class Node
{
private employee e1;
public Node next;
public Node(employee e)
{
this.e1 = e;
}
public void displayNode()
{
System.out.print("( " + e1 +")"+ "\n" );
}
}
class LinkedList
{
private Node first;
private Node last;
private employee e1;


   public LinkedList()
   {
   first = null;
   last = null;
   }
   public boolean isEmpty()
   {
   if(first == null)
   return true;
   else
   return false;
   
   
   }
   public void insertFirst(employee e)
   {
   Node newnode = new Node(e);
   newnode.next = first;
   first = newnode;      
   
   
   
   
   }
   public void insertLast(employee e)
   {
   Node newnode = new Node(e);
   Node current = first;
      if (isEmpty())
      {
      last= newnode;
      current = newnode;
      
      }
      else
      {
         while(current.next != null)
         {
         current = current.next;
         }
      current.next = newnode;
      }
   
   }
   public Node deleteFirst()
   {
   Node temp = first;
   first = first.next;
   return temp;
   
   }
   public void displayList()
      {
         System.out.print("List (first-->last): ");
        Node current = first;
         while(current != null)
         {
            current.displayNode();
           

            current = current.next;
         }
         System.out.println(" ");
      }
}

      class LinkedListedapp
      {
         public static void main(String[] args)
         {
            LinkedList thelist = new LinkedList();
            employee Miti = new employee(" Miti", "1234",200.00, 200.00);
            employee jenny = new employee ("jenny", "1234", 300.00,400.00);
            employee john = new employee ("john", "1234", 350.00, 450.00);
            employee marry = new employee ("marry", "1234", 450.00, 350.00);
            
            thelist.insertFirst(Miti);
            thelist.insertFirst(jenny);
            thelist.insertLast(john);
            
            thelist.insertLast(marry);
            
            thelist.displayList();
            
            /*thelist.deleteFirst();
            
            thelist.displayList();
            
            thelist.deleteFirst();
            
            thelist.displayList();*/
           }
        }
            
