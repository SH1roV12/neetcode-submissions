class LRUCache {
        private Node older;
        private Node newer;
        private int cap;
        private final HashMap<Integer, Node> map;
         class Node{
            int val;
            int key;
            private Node next;
            private Node prev;
            public Node(int val, int key, Node next, Node prev){
                this.key = key;
                this.val = val;
                this.prev = prev;
                this.next = next;
            }
             public Node(int val, int key){
                 this.key = key;
                 this.val = val;
             }

         }

        public LRUCache(int capacity) {
            cap = capacity;
            map = new HashMap<>();
            older = new Node(-1, -1);
            newer = new Node(-1,-1);
            older.next = newer;
            newer.prev = older;
        }
        
        void updateNewer(Node targetNode){
            Node targetNodeNext = targetNode.next;
            Node targetNodePrev = targetNode.prev;
            targetNodePrev.next = targetNodeNext;
            targetNodeNext.prev = targetNodePrev;
            Node newerNode = newer.prev;
            newerNode.next = targetNode;
            targetNode.prev = newerNode;
            targetNode.next = newer;
            newer.prev = targetNode;
        }
        
        public int get(int key) {
            boolean exists = map.containsKey(key);
            if (!exists){
                return -1;
            }
            Node targetNode = map.get(key);
            updateNewer(targetNode);
            return targetNode.val;
        }

        public void put(int key, int value) {
             if (map.containsKey(key)){
                 Node targetNode = map.get(key);
                 targetNode.val = value;
                 updateNewer(targetNode);
                 return;
             }
            
            Node newNode = new Node(value, key, null, null);
            Node newerPrev = newer.prev;
            newerPrev.next = newNode;
            newNode.prev = newerPrev;
            newNode.next = newer;
            newer.prev = newNode;
            map.put(key, newNode);
            if (map.size() > cap){
                Node nodeToDelete = older.next;
                Node nextNodeWithNodeToDelete = nodeToDelete.next;
                older.next = nextNodeWithNodeToDelete;
                nextNodeWithNodeToDelete.prev = older;
                map.remove(nodeToDelete.key);
            }
        }
    }