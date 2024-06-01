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
        Node new_Node = new Node(data);

        // check if head is null, if null, new node is head node, and tail
        if (head == null) {
            head = tail = new_Node;
            return;
        } else {
            // make the new node as head node if the conditon falls
            new_Node.next = head;
            head = new_Node;
        }
    }

    public void append(int data) {
        //create a new Node 
        Node temp = new Node(data);
        temp.next = null;

        if (head == null) {
            head = temp;
        } else {
            Node p;
            p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = temp;
        }
    }
    
    public void addAtlast(int data) {
        //create a node
        Node temp = new Node(data);
        // check if the linked list if empty,
        if (head == null) {
            head = tail = temp;
            return;
        } else {
            // add at tail
            
        }
    }

    public void display() {
        Node s;
        s = head;
        while (s != null) {
            System.out.printf("[%d]-->", s.data);
            s = s.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addAtbegin(1);
        ll.addAtbegin(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.display();
        
    }
}