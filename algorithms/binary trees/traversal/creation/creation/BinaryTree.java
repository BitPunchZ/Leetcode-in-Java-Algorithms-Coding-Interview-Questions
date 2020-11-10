
class Node { 
	int data; 
	Node left, right; 

	public Node(int value) { 
		data = value; 
		left = right = null; 
	} 
} 


public class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 


	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 

		/*create root*/
		tree.root = new Node(4); 

		/* following is the tree after above statement 
			
				4
			/   \
		null  null

	*/
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 

		/* 2 and 3 become left and right children of 4 
 		           4
 		       /       \
 		      2	        3
 	      /  \      /   \
      null null  null  null
	 */


		tree.root.left.left = new Node(5); 
		/* 5 becomes left child of 2 
							 4
 		       /       \
 		      2	        3
 	      /  \      /   \
       5   null  null  null
		*/

    inorder(tree.root);
	} 
} 
