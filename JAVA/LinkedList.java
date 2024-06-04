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

    public void addAtbegin(int data) {
        // create a new node
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void addAtlast(int data) {
        //create a new node 
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void append(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
    }
 

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.printf("[%d]-->", p.data);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        
        ll.addAtlast(3);
        ll.addAtlast(4);
        ll.addAtlast(5);
        ll.addAtbegin(1);
        ll.addAtbegin(2);

        ll.display();
    }
}