class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        HashMap<Character, Integer> characterHashMap = new HashMap();

        for(int i = 0; i < s1.length; i++){
            characterHashMap.put(s1[i],characterHashMap.getOrDefault(s1[i], 0)+1);
        }
        for(char s2char:s2){
            if(!characterHashMap.containsKey(s2char)){
                return false;
            }

            characterHashMap.put(s2char, characterHashMap.getOrDefault(s2char, 0)-1);
            if(characterHashMap.get(s2char) < 0){
                return false;
            }
        }
        return true;
    }
}
