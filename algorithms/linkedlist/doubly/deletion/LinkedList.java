
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

  public int countList() {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      temp = temp.next;
      count += 1;
    }
    return count;
  }

  // we will consider that the index begin at 1
  public Node deleteAtLocation(int index) {
    Node temp = head;

    int count = countList();

    if (count < index) return temp;

    if (index == 1) {
      temp = temp.next;
      head = temp;
      return head;
    }

    if (count == index) {
      while (temp.next!=null && temp.next.next!=null) temp = temp.next;
      temp.next = null;
      return head;
    }

    int i = 1;
    while (i < index - 1) {
      temp = temp.next;
      i += 1;
    }

    Node prevNode = temp;
    Node nodeAtTarget = temp.next;
    Node nextNode = nodeAtTarget.next;

    // 1 => 2 => 3 => 4

    nextNode.prev = prevNode;
    prevNode.next = nextNode;

    return head;
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
    llist.deleteAtLocation(1);
    llist.printList();

	} 
}
