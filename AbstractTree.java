

public abstract class AbstractTree<E> implements Tree<E>
{
   //inorder traversal from the root
   public void inorder(){}
   
   //postorder traversal from the root
   public void postorder(){}
   
   //preorder traversal from the root
   public void preorder(){}
   
   //return true if the tree is empty
   public boolean isEmpty()
   {
      return getSize() == 0;
   }
}