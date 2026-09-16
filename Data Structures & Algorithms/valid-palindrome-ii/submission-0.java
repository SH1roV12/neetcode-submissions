class Solution {
     public  boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        int counter = 0;
        while (left <= right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return palindrome(left+1, right, s)|| palindrome(left,right-1,s);
            }
        }
        return true;
    }
    public boolean palindrome(int l, int r, String str){
        while (l <= r){
            if (str.charAt(l) != str.charAt(r)){
                return false;
            };
            l++;
            r--;
        }
        return true;
    }
}