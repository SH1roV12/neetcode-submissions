class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> digits = new HashMap<>();
        for(int i =0;i < nums.length;i++){

            int needDigit = target - nums[i];
            if(digits.containsKey(needDigit)){
                return new int[]{digits.get(needDigit),i};
            }
            digits.put(nums[i],i);
        }

        return new int[]{};
    }
}
