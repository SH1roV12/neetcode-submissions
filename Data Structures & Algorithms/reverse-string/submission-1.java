class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        for(;l <= r;l++){
            char leftChar = s[l];
            s[l] = s[r];
            s[r] = leftChar;
            r--;
        }
        System.out.println(s);
    }
}