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
     public  ListNode mergeKLists(ListNode[] lists) {
        ListNodeComparator c = new ListNodeComparator();
        Queue<ListNode> nodes = new PriorityQueue<>(c);
        ListNode dummy = new ListNode(0);
        ListNode answ = dummy;
         for (ListNode node : lists) {
            if(node != null){
            nodes.add(node);}
        }
        while (nodes.size() != 0) {
            ListNode node = nodes.poll();
            answ.next = node;
            answ = answ.next;
            if (node.next != null){
                nodes.add(node.next);
            }
        }
        return dummy.next;
    }

    public  class ListNodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return Integer.compare(o1.val, o2.val);

        }
    }
}
