class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> someMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int digit = someMap.getOrDefault(nums[i],0);
            digit++;
            someMap.put(nums[i],digit);
        }
        List<Integer>[] bucketSort = new List[nums.length+1];
        someMap.forEach((key,value)->{
            if (bucketSort[value] == null){
                bucketSort[value] = new ArrayList<>();
            }
            bucketSort[value].add(key);
        });
        List<Integer> answ = new ArrayList();
        for (int i = bucketSort.length-1;i>0;i--){
            if (bucketSort[i] != null){
                for(int value:bucketSort[i]){
                    answ.add(value);
                    if (answ.size() == k){
                        return answ.stream().mapToInt(Integer::intValue).toArray();
                    }
                };
            }
        }
        return null;
    }
}
