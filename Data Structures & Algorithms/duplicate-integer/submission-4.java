class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniq = new HashSet<>();
        for(int d:nums){
            if(uniq.contains(d)){
                return true;
            }
            uniq.add(d);
        }
        return false;
    
    }
}