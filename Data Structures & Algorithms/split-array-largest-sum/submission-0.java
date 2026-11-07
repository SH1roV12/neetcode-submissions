class Solution {
    public int splitArray(int[] nums, int k) {
        int l =  Arrays.stream(nums).max().getAsInt();
        int r = Arrays.stream(nums).sum();
        int res = 0;
        while (l <= r){
            int mid = l + ((r-l)/2);
            if (canSplit(nums,k,mid)){
                res = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }

     public boolean canSplit(int[] nums, int k, int limit){
        int cut = 1;
        int curSum = 0;
        for (int i = 0; i < nums.length; i++){
            if(curSum + nums[i] > limit){
                cut++;
                curSum = nums[i];
                if (cut > k){
                    return false;
                }
            }else{
                curSum+=nums[i];

            }

        }
        return true;
    }
}