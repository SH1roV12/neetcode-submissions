class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> someMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var dif = target-nums[i];
            if (someMap.containsKey(dif)){
                int[] ansArr = {someMap.get(dif),i};
                return ansArr;
            }
            someMap.put(nums[i],i);
        }
    return null;
    }
}
