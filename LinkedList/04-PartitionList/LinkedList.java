package LinkedList.04-PartitionList;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

public void partitionList(int x) {
    if (head == null) return;

    Node smallHead = null, smallTail = null;
    Node largeHead = null, largeTail = null;
    Node temp = head;

    while (temp != null) {
        if (temp.value < x) {
            if (smallHead == null) {
                smallHead = smallTail = temp;
            } else {
                smallTail.next = temp;
                smallTail = temp;
            }
        } else {
            if (largeHead == null) {
                largeHead = largeTail = temp;
            } else {
                largeTail.next = temp;
                largeTail = temp;
            }
        }
        temp = temp.next; 
    }

    if (largeTail != null) {
        largeTail.next = null;
    }


    if (smallHead == null) {
        head = largeHead;
    } else {
        smallTail.next = largeHead;
        head = smallHead;
    }
}


}

