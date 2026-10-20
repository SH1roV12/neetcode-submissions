class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
		int r = 0;
		int max = 0;
		while ( r <= nums.length){
			if (r == nums.length || nums[r] == 0 ){
				max = Math.max(r-l, max);

				r++;
				l=r;
			}else{
				r++;
			}
		}
		return max;
    }
}