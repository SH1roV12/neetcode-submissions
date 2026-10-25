class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        int best = 0;
        while (l <= r){
            int mid = l + ((r - l)/2);
            int k = 1;
            int sum = 0;
                for (int i = 0; i < weights.length; i++){
                    sum+=weights[i];
                    if (sum == mid){

                    }
                    if (sum > mid){
                        k++;
                        i--;
                        sum = 0;
                    }
                }
            if (k > days){
                l = mid+1;
            }else{
                best = mid;
                r = mid-1;
            }
        }
        return best;
    }
}