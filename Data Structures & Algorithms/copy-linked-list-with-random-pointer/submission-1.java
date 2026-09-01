/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         if (head == null){
                return null;
            }
            Map<Node, Node> mapa = new HashMap<>();
            Node cur = head;
             while (cur != null ){
                mapa.put(cur, new Node(cur.val));
                cur = cur.next;
            }
            cur = head;
            while (cur != null){
                mapa.get(cur).next = mapa.get(cur.next);
                mapa.get(cur).random = mapa.get(cur.random);
                cur = cur.next;
            }
            return mapa.get(head);
        
    }
}
