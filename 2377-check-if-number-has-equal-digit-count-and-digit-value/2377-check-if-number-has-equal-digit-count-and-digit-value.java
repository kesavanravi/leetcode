class Solution {
    public boolean digitCount(String s) {
      int freq[]=new int [10];
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'0']++;
      }
      for(int i=0;i<s.length();i++){
        if(freq[i]!=s.charAt(i)-'0') return false;
      }
      return true;
    }
}