public class P0021MergeTwoSortedLists {
    public static void main(String[] args) throws Exception {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;


        System.out.println(mergeTwoLists(l1,l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val) {
                ret.next = l2;
                ret = ret.next;
                l2 = l2.next;

            } else {
                ret.next = l1;
                ret = ret.next;
                l1 = l1.next;
            }
        }
        if(l1 != null){
            ret.next = l1;
        } else {
            ret.next = l2;
        }

        return head.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
