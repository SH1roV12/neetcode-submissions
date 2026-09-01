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
    public ListNode removeNthFromEnd(ListNode head, int n) {
int len = 1;
        ListNode cur = head;
        while (cur != null && cur.next != null){
            len++;
            cur = cur.next;
        }
        int needRemoveIndex = len-n;
        ListNode dummy = new ListNode(0,head);
        cur = head;
        ListNode prev = dummy;
        int count = 0;
        while (cur != null){
            if (count == needRemoveIndex){
                ListNode curNext = cur.next;
                prev.next = curNext;
                cur = null;
                break;
            }
            prev = cur;
            count++;
            cur = cur.next;
        }
        return dummy.next;
    }
}
