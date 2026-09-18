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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        cur.next = head;
        cur = cur.next;
        ListNode prev = dummy;
        while(cur != null){
            if(cur.val == val){
                ListNode next = cur.next;
                prev.next = next;
                cur.next = null;
                cur = next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    }
