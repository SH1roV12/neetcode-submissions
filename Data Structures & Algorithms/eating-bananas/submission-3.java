class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         var max = Arrays.stream(piles).max().getAsInt();
        int min = 1;
        int probablyAnsw = 0;
        while (min<=max){
            int mid = min + ((max-min)/2);

            long totalTime = 0;
            for (int value: piles){
                totalTime += (value + mid -1)/mid;
            }

            if (totalTime <= h){
                probablyAnsw = mid;
                max = mid-1;
                }
            else{
                min = mid+1;
            }
        }
        return probablyAnsw;
    }
}
