class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> answ = new ArrayList<>();
        int left;
        int right;
        for (int i =0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            left = i+1;
            right = nums.length -1;
            int firstDigit = nums[i];
            int target = -firstDigit;
            while (left < right){
                int sum = nums[left]+nums[right];
                if (sum > target){
                    right--;
                    continue;
                }
                if (sum < target){
                    left++;
                    continue;
                }
                if (sum == target){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[left]);
                    lst.add(nums[right]);
                    answ.add(lst);
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return answ;
    }
}
