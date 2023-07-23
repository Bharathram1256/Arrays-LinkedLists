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

        if (n < 0) {
            System.err.println("Invalid input. Please enter a non-negative integer.");
            return null;
        }

        try {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            System.out.println("Enter the elements of the linked list:");
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                current.next = new ListNode(val);
                current = current.next;
            }

            return dummy.next;
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter integers only.");
            return null;
        }
    }

    // for printing the linked list
    public static void printLL(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Merge two sorted linked lists
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    
    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        
        ListNode mid = findMiddle(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        
        left = mergeSort(left);
        right = mergeSort(right);

        
        return merge(left, right);
    }

    
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

            System.out.println("Merged linked list:");
            ListNode mergedList = merge(list1, list2);
            printLL(mergedList);

            System.out.println("Sorted linked list:");
            ListNode sortedList = mergeSort(mergedList);
            printLL(sortedList);
        }
    }
}