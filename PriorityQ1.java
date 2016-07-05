
public class PriorityQ1
{
   private int maxSize;
   //private  long HeapArray[];
   private int nItems;
   private Heap heap;
   
   public PriorityQ1(int s)
   {
       maxSize = s;
     //HeapArray = new long[maxSize];
      nItems = 0;
      //for(int i = 0; i < item.length; i++)
       //  add(item[i]);
       heap = new Heap();

   }
   public void add(int item)
   {
   heap.add(new Integer(item));
   /*
   
  // Heap.add(item);
      int j;
      if(nItems == 0)
         HeapArray[nItems++] = item;
      else   
      {
         for(j = nItems-1; j>=0; j--)
         {
            if(item < HeapArray[j])
               HeapArray[j+1] = HeapArray[j];
            else
               break;
         }
         HeapArray[j+1] = item;
         nItems++;
     
      */
      
    }
   public int remove()
   {
      return (Integer) heap.remove(); 
     // HeapArray[--nItems];
   }  
   
  // public long peekMin()
  // {
    //  return HeapArray[nItems - 1];
   //}  
   public boolean isEmpty()
   {
      return (heap.getSize() == 0);
   }
   public boolean isFull()
   {
      return (nItems == maxSize);
   }
}
class PriorityQApp
{
   public static void main(String[] args)
   {
      PriorityQ1 thePQ = new PriorityQ1(5);
      thePQ.add(30);
      thePQ.add(50);
      thePQ.add(10);
      thePQ.add(40);
      thePQ.add(20);
      System.out.println(" ");
      
      thePQ.remove();
      thePQ.remove();
      System.out.print(" ");
      
      while(!thePQ.isEmpty())
      {
         int item = thePQ.remove();
         System.out.print(item + " ");
      }
      System.out.println(" ");
   }
}
