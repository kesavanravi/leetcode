class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char i:s.toCharArray()){
            set.add(i);
        }
        return set.size();
    }
}