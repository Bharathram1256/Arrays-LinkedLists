import java.util.Scanner;
public class MergeAndSort {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode createLL(Scanner scanner) {
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    // for printing the linked lists
    public static void printLL(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first linked list:");
            ListNode list1 = createLL(scanner);

            System.out.println("Enter the second linked list:");
            ListNode list2 = createLL(scanner);

            System.out.println("First linked list:");
            printLL(list1);

            System.out.println("Second linked list:");
            printLL(list2);
        }
    }
}