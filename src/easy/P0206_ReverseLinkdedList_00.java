package easy;

public class P0206_ReverseLinkdedList_00 {

    public static void main(String[] args) throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        System.out.println(reverseList(node));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;

        while (next != null) {
            ListNode temp = next.next;
            next.next = head;
            head = next;
            next = temp;
//            System.out.println(head);
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val +
                    "," + next;
        }
    }

}
