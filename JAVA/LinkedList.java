import java.util.*;

public class LinkedList {
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // size of linked list (it will not traverse the linked list on each step)
  public static int size;

  public void addBegin(int data) {
    Node temp = new Node(data);
    size++;
    // check if linked list is empty or not
    if (head == null) {
      head = tail = temp;
      return;
    } else {
      temp.next = head;
      head = temp;
    }
  }

  public void addLast(int data) {
    Node temp = new Node(data);
    size++;
    if (head == null) {
      head = tail = temp;
      return;
    } else {
      tail.next = temp;
      tail = temp;
    }
  }

  public void append(int data) { // append the data at end of list
    Node temp = new Node(data);
    size++;
    if (head == null) {
      head = tail = temp;
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = temp;
    tail = temp;
  }

  public void add(int index, int data) { // at any index and location
    // Linked list already exist
    if (index < 0 || index > size) {
      System.out.println("Invalid index: " + index);
      return;
    }
    if (index == 0) {
      addBegin(data);
      return;
    }
    if (index == size) {
      addLast(data);
      return;
    }
    Node new_Node = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    new_Node.next = temp.next;
    temp.next = new_Node;
  }

  public int length() {
    Node current = head;
    int length = 0;
    if (head == null) {
      return 0;
    }
    while (current != null) {
      current = current.next;
      length++;
    }
    return length;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    } else {
      int val = head.data;
      head = head.next;
      size--;
      return val;
    }
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("Linked List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    } else {
      // tail previous -> i = size -2;
      Node prev = head;
      for (int i = 0; i < size - 2; i++) {
        prev = prev.next;
      }
      int val = prev.next.data;
      prev.next = null;
      tail = prev;
      size--;
      return val;
    }
  }

  public int iterativeSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp.next != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  public void display() {
    Node tempNode = head;
    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }
    while (tempNode != null) {
      System.out.printf("[%d]->", tempNode.data);
      tempNode = tempNode.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create the Node cobject
    LinkedList ll = new LinkedList();

    ll.add(0, 8);
    ll.append(5);
    ll.append(9);
    ll.display();
    ll.removeFirst();
    ll.display();

    System.out.println(ll.iterativeSearch(9));

    input.close();
  }
}

