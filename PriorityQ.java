
class PriorityQ<E extends Comparable<E>>

{
   private int maxSize;
   private  Heap<E> heap = new Heap();
   private int nItems;
   private Heap Heap;
   
   public PriorityQ(E[] item)
   {
      //maxSize = s;
    // HeapArray = new long[maxSize];
      nItems = 0;
      for(int i = 0; i < item.length; i++)
         add(item[i]);

   }
   public void add(E item)
   {
   
   Heap.add(item);
   /*
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
     
      }
      */
    }
   public E remove()
   {
      return  heap.remove;//HeapArray[--nItems];
   }  
   
   public long peekMin()
   {
      return HeapArray[nItems + 1];
   }  
   public boolean isEmpty()
   {
      return (nItems == 0);
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
      PriorityQ thePQ = new PriorityQ(5);
      thePQ.add(30);
      thePQ.add(50);
      thePQ.add(10);
      thePQ.add(40);
      thePQ.add(20);
      thePQ.remove();
      
      while(!thePQ.isEmpty())
      {
         long item = thePQ.remove();
         System.out.print(item + " ");
      }
      System.out.println(" ");
   }
}
