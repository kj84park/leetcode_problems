package easy;

import java.util.HashMap;
import java.util.Map;

public class P0083_RemoveDuplicateFromSortedList {
    public static void main(String[] args) throws Exception {

        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);

        System.out.println(deleteDuplicates(node));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new HashMap<>();
        ListNode ret = head;
        if(ret == null){
            return null;
        }
        map.put(ret.val,1);
        while(ret.next != null){
            if(!map.containsKey(ret.next.val)) {
                map.put(ret.next.val,1);
                ret = ret.next;
            } else {
                ret.next = ret.next.next;
            }

            if(ret == null){
                break;
            }
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
