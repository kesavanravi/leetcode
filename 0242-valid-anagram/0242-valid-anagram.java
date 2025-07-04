class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-97]++;
        }
        for(char c:t.toCharArray()){
            freq[c-97]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}