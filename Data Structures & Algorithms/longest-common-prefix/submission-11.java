class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder curPref = new StringBuilder("");
        int k = 0;
        while (k < strs[0].length() && k < strs[1].length() && strs[0].charAt(k) == strs[1].charAt(k)){
            curPref.append(strs[0].charAt(k));
            k++;
        }
        if (strs.length == 2){
            return curPref.toString();
        }
        for (int i = 2; i < strs.length; i++){
            k = 0;
            while (k < curPref.length() && k < strs[i].length()){

                if (curPref.charAt(k) != strs[i].charAt(k)){
                    break;
                }
                k++;
            }
            curPref.setLength(k);
        }
        return curPref.toString();
    }
}