import java.util.Scanner;

class Node {
    public int item;
    public Node next; // pointing to next node.
}

public class deleteDuplicate {
    private Node head;

    // This is a constructor.
    public deleteDuplicate() {
        this.head = null;
    }

    public void insertingnode(int i) {
        Node node = new Node();
        node.item = i;
        Node current = this.head;
        if (this.head == null) {
            this.head = node;
            this.head.next = null;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
    }


    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        deleteDuplicate llist = new deleteDuplicate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list:");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            llist.insertingnode(element);
        }

        System.out.println("Linked list before removing duplicates:");
        llist.display();

       

        scanner.close();
    }
}

