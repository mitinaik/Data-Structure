
boolean delete(E e)
{
   Locate element e in the tree;
   if element e is not found
      return false;
   
   Let current be the node that contains e and parent
      be the parent of current;
      
   if (current has no left child) //case 1
      Connect the right child of 
         current with parent; now current is not referenced, so
      it is eliminated;
   else // case 2
      Locate the rightmost node in the left subtree of current,
      Copy the element value in the rightmost node to current.
      Connect the parent of the rigtmost node to the left 
      child of rightmost node;
   
   return true; //Element deleted
}