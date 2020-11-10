
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

  // we will consider that the index begins at 1
  public Node insertAtLocation(int value, int index) {
    Node temp = head;

    int count = countList();

    // index is 6, count is 5, valid
    // index is 7, count is 5, not valid
    if (count + 1 < index) return temp;

    Node newNode = new Node(value);

    if (index == 1) {
      newNode.next = temp;
      temp.prev = newNode;
      head = newNode;
      return head;
    }

    if (index == count + 1) {
      while (temp.next != null) temp = temp.next;

      temp.next = newNode;
      newNode.prev = temp;
      return head;
    }
    int i = 1;
    while (i < index - 1) {
      temp = temp.next;
      i += 1;
    }

    Node nodeAtTarget = temp.next;

    newNode.next = nodeAtTarget;
    nodeAtTarget.prev = newNode;

    temp.next = newNode;
    newNode.prev = temp;

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
    llist.insertAtLocation(1,1);
    llist.printList();

	} 
}
