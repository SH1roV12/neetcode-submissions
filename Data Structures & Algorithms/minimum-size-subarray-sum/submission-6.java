class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int best = 0;
        while(r < nums.length){
            while (sum < target && r < nums.length){
                sum+=nums[r];
                r++;
                
            }
            if( sum < target && l == 0){
                return 0;
            }
            if (best == 0){
                best = r-l;
            }else{
                best = Math.min(best,r-l);
            }

            while( sum >= target){
                sum-=nums[l];
                l++;
            }
            best = Math.min(best,r-l+1);
        }
        return best;
    }
}