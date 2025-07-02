class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int end=0;
        int max=0;
        HashSet<Character> list=new HashSet<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                max=Math.max(max,list.size());
                end++;
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    
    }
}