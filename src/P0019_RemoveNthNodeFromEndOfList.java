public class P0019_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);

        System.out.println(removeNthFromEnd(node,3));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode clone = head;
        int size = 1;

        while(clone.next != null){
            size++;
            clone = clone.next;
        }

        if(size < n || (size == 1 && n == 1)){
            return null;
        }

        if(size == n){
            head = head.next;
            return head;
        }

        ListNode clone2 = head;

        for(int i = 1; i < size-n ; i++){
            clone2 = clone2.next;
        }

        if(clone2.next != null) {
            clone2.next = clone2.next.next;
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
    }

}
