class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> someList = new ArrayList<>();
        HashMap<String, List<String>> passWord = new HashMap<>();
        for(String s:strs){
            char[] chrs =  s.toCharArray();
            Arrays.sort(chrs);
            String sortedStr = new String(chrs);
            if (passWord.containsKey(sortedStr)){
                passWord.get(sortedStr).add(s);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(s);
                passWord.put(sortedStr, lst);
            }
        }
        for (List<String> l: passWord.values()){
            someList.add(l);
        }
        return someList;
    
    }
}
