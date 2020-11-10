
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

	//we consider index to start at 0
	public void deleteNode(int key) {
    Node temp = head;
    if (temp == null) return;
    if (temp.data == key) {
      head = temp.next;
      temp = null;
      return;
    }
    while (temp.next.data != key) {
      temp = temp.next;
    }

    Node target_node = temp.next;
    temp.next = target_node.next;
    target_node.next = null;
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
    third.next = fourth;
		llist.deleteNode(3);
		llist.printList(); 

	} 
}
