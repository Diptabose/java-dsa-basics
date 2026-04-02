class Node {
    public int data;
    public Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(Node node) {
        this.data = node.data;
        this.next = node.next;
    }

    @Override
    public String toString() {
        return "[Node (data: " + this.data + ", " + "node:" + this.next + ")]";
    }
}

class LL {

    public Node head;

    public int size = 0;

    public LL add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        this.size++;
        return this;
    }

    public void addToStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public LL addAt(int index, int data) {

        if (index > size) {
            throw new IllegalArgumentException("Index can't be more than size.");
        }
        if (index == 0) {
            this.addToStart(data);

        } else {
            Node temp = head;
            int counter = 0;
            while (counter < index - 1) {
                temp = temp.next;
                counter++;
            }
            Node next = temp.next;
            temp.next = new Node(data);
            temp.next.next = next;
        }
        this.size++;
        return this;
    }

    public LL removeAt(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            int counter = 0;

            while (counter < index - 1) {
                temp = temp.next;
                counter++;
            }
            Node next = temp.next.next;
            temp.next = next;
        }

        return this;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

}

public class LinkedList {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.add(5).add(6).add(7);
        ll.addAt(2, 99).print();
        System.out.println("Deleting....");
        ll.removeAt(1).print();
    }

}
