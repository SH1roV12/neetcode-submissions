class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while ( l <= r){
            if (nums[l] == val){
                while(nums[r] == val){
                    if(r == l){
                        return r;
                    }
                    r--;
                }
                int prevL = nums[l];
                nums[l] = nums[r];
                nums[r] = prevL;

            }
            l++;
        }
        return r+1;
    }
}