class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SortedLinkedList {
    Node head;

    SortedLinkedList() {
        head = null;
    }

    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null || head.val >= newNode.val) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.val < newNode.val) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,7,6,8,5,4,2,4,6,8,5,4,5,6,7,5,3,5,6};
        SortedLinkedList sortedList = new SortedLinkedList();
        for (int num : nums) {
            sortedList.insert(num);
        }
        sortedList.printList(); // output: 1 2 3 4 4 4 5 5 5 5 5 5 6 6 6 6 7 7 8 8
    }
}
