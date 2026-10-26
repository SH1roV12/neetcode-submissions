class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int l = 0;
        int r = 1;
        int k = 1;
        while (r < nums.length){
            if (nums[r] != nums[l]){
                l++;
                nums[l]= nums[r];
                k++;
            }
            r++;
        }
        return k;
    }
}