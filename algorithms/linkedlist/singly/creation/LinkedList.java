
class LinkedList { 
	Node head; // head of list 

	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		}  
	} 

	public void printList() 
	{ 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 

		llist.head = new Node(5); 
		Node second = new Node(3); 
		Node third = new Node(2); 
		Node fourth = new Node(4); 

		llist.head.next = second; 
		second.next = third;
    	third.next = fourth
		llist.printList(); 
	} 
}
