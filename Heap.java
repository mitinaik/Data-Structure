import java.util.ArrayList;

//In the Code below, Generics has been used,
//According to rule of generics, when we use Generic class or WildCard, 
//keyword should be extends, even if it is implementing an interface, 
//there is nothing called implements while dealing with generics

public class Heap<E extends Comparable<E>>
{  
   private ArrayList<E> list = new ArrayList<>();
   
   //create a default heap
   public Heap(){}
   
   //create a heap from an array of objects
   public Heap(E[] objects)
   {
      for(int i = 0; i < objects.length; i++)
         add(objects[i]);
   }
   
   //add a new object into the heap
   public void add(E newObject)
   {
      list.add(newObject); //append to the heap
      int currentIndex = list.size() - 1;
      
      while(currentIndex > 0)
      {
         int parentIndex = (currentIndex -1)/2;
         //swap if the current object is greater than its parent
         if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0)
         {
            E temp = list.get(currentIndex);
            list.set(currentIndex, list.get(parentIndex));
            list.set(parentIndex, temp);
         }
         else
            break;
         
         currentIndex = parentIndex;
      }
   }
   //remove the root from the heap
   public E remove()
   {
      if(list.size() == 0) return null;
      
      E removeObject = list.get(0);
      list.set(0, list.get(list.size() -1));
      list.remove(list.size() -1);
      
      int currentIndex = 0;
      while(currentIndex < list.size())
      {
         int leftChildIndex = 2 * currentIndex + 1;
         int rightChildIndex = 2 * currentIndex + 2;
         
         //find the maximum between two children
         if(leftChildIndex >= list.size()) break;
         int maxIndex = leftChildIndex;
         if(rightChildIndex < list.size())
         {
            if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0)
               maxIndex = rightChildIndex;
         }
      
      
         //swap if the current node is less than the maximum
         if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0)
         {
            E temp = list.get(maxIndex);
            list.set(maxIndex, list.get(currentIndex));
            list.set(currentIndex, temp);
            currentIndex = maxIndex;
         }
         else
            break;   
      }
      return removeObject;
    }
    
    //get the number of nodes in the tree
    public int getSize()
    {
      return list.size();
    }
}