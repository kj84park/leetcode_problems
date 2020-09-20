package medium;

public class P0024_SwapNodesInPairs {
    public static void main(String[] args) throws Exception {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        System.out.println(swapPairs(node));
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode newNode = new ListNode(-1);
        newNode.next = head;

        ListNode dummy = newNode;

        while(dummy.next != null && dummy.next.next != null){
            ListNode one = dummy.next;
            ListNode two = dummy.next.next;

            one.next = two.next;
            two.next = one;

            dummy.next = two;
            dummy = one;

        }

        return newNode.next;
    }


     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
  }
