class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> chars = new HashMap<>();
        for(char c:s.toCharArray()){
            chars.put(c, chars.getOrDefault(c,0 )+1);
        }

        for (char c:t.toCharArray()){
            chars.put(c, chars.getOrDefault(c, 0) - 1);
        }
        for (int c: chars.values()){
            if (c!=0){
                return false;
            }
        }

        return true;
    
    }
}
