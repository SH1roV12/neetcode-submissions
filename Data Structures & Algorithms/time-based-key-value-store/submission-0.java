class TimeMap {
        private final HashMap<String, TimeMapBucket> bucketsMap;
        public TimeMap() {
            bucketsMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(!this.bucketsMap.containsKey(key)){
                TimeMapBucket bucket = new TimeMapBucket(value, timestamp);
                this.bucketsMap.put(key,bucket);
                return;
            }
            TimeMapBucket bucket = bucketsMap.get(key);
            bucket.set(value, timestamp);
        }

        public String get(String key, int timestamp) {
            if (!bucketsMap.containsKey(key)){
                return "";
            }
            TimeMapBucket bucket = bucketsMap.get(key);
            return bucket.get(timestamp);
        }

        class TimeMapBucket{
            private int min;
            private int max;

            private List<TimeMapBucketNode> nodes;
            public TimeMapBucket(String value, int timestamp){
                nodes = new ArrayList<>();
                min = 0;
                max = 0;
                set(value,timestamp);

            }
            public void set(String value, int timestamp){
                TimeMapBucketNode node = new TimeMapBucketNode(timestamp,value);
                this.nodes.add(node);
                max = this.nodes.size() - 1;

            }
            public String get(int timestamp){
                if (this.nodes.get(max).timestamp <= timestamp){
                    return this.nodes.get(max).value;
                }
                    int left = 0;
                    int right = this.nodes.size()-1-1;
                    int mid;
                    TimeMapBucketNode maybeNode = null;
                    while (left <= right) {
                        mid = left + ((right - left) / 2);
                        TimeMapBucketNode node = this.nodes.get(mid);
                        if (node.timestamp == timestamp) {
                            return node.value;
                        }
                        if (node.timestamp > timestamp) {
                            right = mid - 1;
                            continue;
                        }
                        if (node.timestamp < timestamp) {
                            maybeNode = node;
                            left = mid + 1;
                        }

                    }
                    if (maybeNode == null){
                        return "";
                    }
                return maybeNode.value;
            }
        }
        class TimeMapBucketNode{
            private int timestamp;
            private String value;
            public TimeMapBucketNode(int timestamp, String value){
                this.timestamp = timestamp;
                this.value = value;
            }
        }
    }