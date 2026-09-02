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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
            ListNode dummy = new ListNode(0, answer);
            ListNode l1pointer = l1;
            ListNode l2pointer = l2;
            while (l1 != null || l2 != null){
                int total = answer.val;
                
                if (l1 == null){
                    total += l2.val;
                    l2 = l2.next;
                }
                else if (l2 == null){
                    total += l1.val;
                    l1 = l1.next;
                }
                else{
                    total += l1.val + l2.val;
                    l1 = l1.next;
                    l2 = l2.next;
                }

                if (total >= 10){
                    answer.val = total % 10;
                    answer.next = new ListNode(1);
                    answer = answer.next;
                    continue;
                }else{
                    answer.val = total;
                    if(l1 == null && l2 == null){
                        break;
                    }
                    answer.next = new ListNode(0);
                    answer = answer.next;
                }
            }
            return dummy.next;
    }
}
