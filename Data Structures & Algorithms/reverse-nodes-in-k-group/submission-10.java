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
    public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k == 1) {
                return head;
            }     
            int count = 1;
             ListNode left = head;
             ListNode right = head;
             ListNode cur = head;
             ListNode dummy = new ListNode(0);
             ListNode node = dummy;
             while (right != null && right.next != null ){
                 right = right.next;
                 count++;


                 if(count == k){

                     right = right.next;
                     count = 1;
                     ListNode prev = null;
                     ListNode start = cur;
                     while (cur != right){
                         ListNode curNext  = cur.next;
                         cur.next = prev;
                         prev = cur;
                         cur = curNext;
                     }
                     node.next = prev;
                     node = start;
                     left = cur;
                     if(right == null || right.next == null){
                         node.next = cur;
                     }
                 }else{
                    node.next = cur;
                 }
             }
             return dummy.next;
        }

    }

