// Java program to demonstrate insert operation in binary search tree 
class BinarySearchTree { 

	/* Class containing left and right child of current node and key value*/
	class Node { 
		int key; 
		Node left, right; 

		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 

	// Root of BST 
	Node root; 

	// Constructor 
	BinarySearchTree() { 
		root = null; 
	} 

	// This method mainly calls insertRec() 
	void insert(int key) { 
		root = insertHelper(root, key); 
	} 
	
	/* A recursive function to insert a new key in BST */
	Node insertHelper(Node root, int key) { 

		/* If the tree is empty, return a new node */
		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 

		/* Otherwise, recur down the tree */
		if (key < root.key) 
			root.left = insertHelper(root.left, key); 
		else if (key > root.key) 
			root.right = insertHelper(root.right, key); 

		/* return the (unchanged) node pointer */
		return root; 
	} 


	void preorder() { 
		preorderHelper(root); 
	} 

	// A utility function to do inorder traversal of BST 
	void preorderHelper(Node root) { 
		if (root != null) { 
			preorderHelper(root.left); 
			System.out.println(root.key); 
			preorderHelper(root.right); 
		} 
	} 

	// Driver Program to test above functions 
	public static void main(String[] args) { 
		BinarySearchTree tree = new BinarySearchTree(); 

		/* FINAL BST LOOKS 
					60 
				/     \ 
			35      75 
		 /  \    /  \ 
		30   50  65  85 
	  */

		//create root
		/* CURRENT BST LOOKS 
					 60 
				/      \ 
			null      null 
			
	  */
		tree.insert(60); 

		//insert 35
		/* CURRENT BST LOOKS 
					 60 
				/      \ 
			35         null 
		 /  \       /    \ 
	null   null  null  null 
	*/
		tree.insert(35); 

		//insert 30
		/* CURRENT BST LOOKS 
					60 
				/     \ 
			35      null 
		 /   \     
		30   null   
	  */
		tree.insert(30); 

		//insert 50
		/* CURRENT BST LOOKS 
					60 
				/     \ 
			35      null 
		 /   \     
		30   50   
	  */
		tree.insert(50); 

		//insert 75
		/* CURRENT BST LOOKS 
					60 
				/     \ 
			35        75 
		 /  \      /  \ 
		30   50  null  null 
	  */
		tree.insert(75);

		//insert 65
		/* CURRENT BST LOOKS 
					60 
				/     \ 
			35        75 
		 /  \      /  \ 
		30   50  65  null 
	  */
		tree.insert(65); 

		//insert 85
		/* FINAL BST LOOKS 
					60 
				/     \ 
			35      75 
		 /  \    /  \ 
		30   50  65  85 
	  */
		tree.insert(85); 

		// print inorder traversal of the BST 
		tree.preorder(); 
	} 
} 