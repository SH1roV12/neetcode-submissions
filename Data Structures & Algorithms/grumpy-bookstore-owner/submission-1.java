class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int defaultFun = 0;
        for (int i = 0; i < grumpy.length; i++){
            if (grumpy[i] == 0){
                defaultFun += customers[i];
            }
        }
        int curF = 0;
        int fun = 0;
        int l = 0;
        int r = 0;
        int ans = 0;
        while (r < grumpy.length){

            if (grumpy[r] == 1){
                fun+=customers[r];

            }
            if (r >= minutes - 1){

                curF = defaultFun + fun;
                ans = Math.max(ans, curF);
                if (grumpy[l] == 1){
                    fun-=customers[l];
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}