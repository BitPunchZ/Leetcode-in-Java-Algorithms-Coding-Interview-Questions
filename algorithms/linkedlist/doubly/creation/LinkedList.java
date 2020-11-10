
class LinkedList { 
	Node head; // head of list 

	static class Node { 
		int data; 
		Node next; 
    Node prev;
		Node(int d) 
		{ 
			data = d; 
			next = null;
      prev = null;
		}  
	} 

	public void printList() 
	{ 
		Node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
	} 

  public Node createList(int arr[]) {
    Node start = head;
    int n = arr.length;

    Node temp = start;
    int i = 0;

    while (i < n) {
      Node newNode = new Node(arr[i]);
      if (i == 0) {
        start = newNode;
        temp = start;
      } else {
        temp.next = newNode;
        newNode.prev = temp;
        temp = temp.next;
      }
      i += 1;
    }
    head = start;
    return start;
  }

	public static void main(String[] args) 
	{ 
		int[] arr = {1, 2, 3, 4, 5};

    LinkedList llist = new LinkedList();

    llist.createList(arr);

    llist.printList();

	} 
}
