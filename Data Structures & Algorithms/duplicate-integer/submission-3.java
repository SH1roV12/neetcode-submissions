class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqNumbers = new HashSet<>();
        for( int num:nums){
            boolean number = uniqNumbers.add(num);
            if (number == false){
                return true;
            }
        }
        return false;
    }
}