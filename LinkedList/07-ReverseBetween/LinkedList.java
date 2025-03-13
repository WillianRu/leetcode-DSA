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
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
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
    
    public void reverseBetween(int m, int n){
        if (head == null || m == n) return; 
    
        Node dummy = new Node(0);
        dummy.next = head;
        Node before = dummy; 
    
        for (int i = 0; i < m; i++) {
            before = before.next;
        }
    
        Node startIndex = before.next;
        Node temp = startIndex.next; 
    
        for (int i = 0; i < n - m; i++) {
            startIndex.next = temp.next; //  Ahora 2.next = 4 (desconectamos 3 de 2).
            temp.next = before.next; // 3.next = 2 (conectamos 3 antes de 2).
            before.next = temp; // 1.next = 3 (conectamos 1 con 3).
            temp = startIndex.next; // Ahora temp apunta a 4.
        }
    
        if (m == 0) {
            head = dummy.next;
        }
    }
    
}


