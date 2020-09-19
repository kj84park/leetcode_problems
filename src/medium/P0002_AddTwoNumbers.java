package medium;

import java.math.BigInteger;

public class P0002_AddTwoNumbers {

    public static void main(String[] args) throws Exception {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String result01 = "";
        String result02 = "";

        result01 += String.valueOf(l1.val);
        while (l1.next != null) {
            result01 += String.valueOf(l1.next.val);
            l1.next = l1.next.next;
        }

        result02 += String.valueOf(l2.val);
        while (l2.next != null) {
            result02 += String.valueOf(l2.next.val);
            l2.next = l2.next.next;
        }

        StringBuilder stringBuffer01 = new StringBuilder();
        StringBuilder stringBuffer02 = new StringBuilder();

        result01 = stringBuffer01.append(result01).reverse().toString();
        result02 = stringBuffer02.append(result02).reverse().toString();

        BigInteger val = new BigInteger(result01).add(new BigInteger(result02));
        String[] valString = new StringBuilder().append(val).reverse().toString().split("");

        ListNode node = new ListNode();
        ListNode dynamicNode = node;
        for (int i = 0; i < valString.length; i++) {
            dynamicNode.val = Integer.parseInt(valString[i]);
            if (i != valString.length - 1) {
                dynamicNode.next = new ListNode();
                dynamicNode = dynamicNode.next;
            }
        }

        return node;
    }

    public class ListNode {
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
