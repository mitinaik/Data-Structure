
public interface Tree<E> extends Iterable<E>
{
   //return true is the element is in the tree
   public boolean search(E e);
   
   //insert element e into the BST.
   //return true if the element is inserted successfully
   public boolean insert(E e);
   
   //delete the specified element from the tree
   //return true if the element is deleted successfully
   public boolean delete(E e);
   
   //inorder traversal from the root
   public void inorder();
   
   //postorder traversal from the tree
   public void postorder();
   
   //preorder traversal from the tree
   public void preorder();
   
   //get the number of nodes in the tree
   public int getSize();
   
   //return true if the tree is empty
   public boolean isEmpty();
}