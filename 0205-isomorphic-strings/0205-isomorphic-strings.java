class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> set1=new HashSet<>();
        for(char c:s.toCharArray()){
            set1.add(c);
        }
        HashSet<Character> set2=new HashSet<>();
             for(char c:t.toCharArray()){
               set2.add(c);
                 }
     if(set1.size()!=set2.size()) return false;
        Map<Character,Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
           if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
           }
           else{
            mp.put(s.charAt(i),t.charAt(i));
           }
        }
        return true;
    }
}