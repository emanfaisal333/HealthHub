public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }// constructor
     // getter

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public Node getEntry(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public void add(Medicine data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }// add method

    public void remove(Medicine targetObject) {
        Node current = head;

        while (current != null) {
            if (current.data.equals(targetObject)) {
                if (current == head) {
                    // Remove from the beginning
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        // The list is now empty
                        tail = null;
                    }
                } else if (current == tail) {
                    // Remove from the end
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    // Remove from the middle
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                return; // Object found and removed, exit the method
            }

            current = current.next;
        }
        System.out.println("Object not found: " + targetObject);
    }// remove method

    public void displayInfo() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}// class