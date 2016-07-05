
class Queue
{
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
   
   public Queue(int s) //constructor
   {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }
   public void insert(long j) //put item at rear of queue
   {
      if (rear == maxSize - 1) //deal with wraparound
         rear = -1;
      queArray[++rear] = j; //increment rear and insert
      nItems++;         //one more item
   }
   public long remove()  //take item from front of queue
   {
      long temp = queArray[front++]; //get value and increment front
      if(front == maxSize) //deal with wraparound
         front = 0;
      nItems --;  //one less item
      return temp;
   }
   public long peekFront()
   {
      return queArray[front];
   }
   public boolean isEmpty()   //true if queue is empty
   {
      return (nItems == 0);
   }
   public boolean isFull()  //true if queue is full
   {
      return (nItems == maxSize);
   }
   public int size()  //number of items in queue
   {
      return nItems;
   }
   
}
class QueueApp
{
   public static void main(String[] args)
   {
      Queue theQueue = new Queue(5);
      
      theQueue.insert(10);
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      
      theQueue.remove();
      theQueue.remove();
      theQueue.remove();
      
      theQueue.insert(50);
      theQueue.insert(60);
      theQueue.insert(70);
      theQueue.insert(80);
      
      while(!theQueue.isEmpty())
      {
         long n = theQueue.remove();
         System.out.println(n);
         System.out.print(" ");
         
      }
      System.out.println(" ");
   }
}