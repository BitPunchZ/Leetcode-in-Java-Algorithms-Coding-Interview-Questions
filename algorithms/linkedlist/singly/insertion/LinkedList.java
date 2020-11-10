
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

	public Node getPrev(int pos){
			Node temp = head;
      int count = 1;
      while (count < pos) {
        temp = temp.next;
        count += 1;
      }
      return temp;
	}

	//we consider index to start at 0
	public void insertNode(int val, int pos) {
    Node target = new Node(val);
    if (pos == 0) {
      target.next = head;
      head = target;
      return;
    }
    
    Node prev = getPrev(pos);
    Node nextNode = prev.next;

    prev.next = target;
    target.next = nextNode;
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
		llist.insertNode(1,0);
		llist.printList(); 

	} 
}
