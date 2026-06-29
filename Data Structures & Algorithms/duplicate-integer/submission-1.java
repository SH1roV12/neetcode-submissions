class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqNumbers = new HashSet<>();
        for( int num:nums){
            uniqNumbers.add(num);
        }

        return uniqNumbers.size() < nums.length;
    }
}