/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (second != null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        ListNode halfOneNode = head;
        ListNode halfTwoNode = prev;

        while (halfOneNode != null && halfTwoNode != null ){
            ListNode halfOneNext = halfOneNode.next;
            ListNode halfTwoNext = halfTwoNode.next;
            halfOneNode.next = halfTwoNode;
            halfTwoNode.next = halfOneNext;
            
            halfOneNode = halfOneNext;
            halfTwoNode = halfTwoNext;

        }
        System.out.println(halfOneNode);

    }
}
