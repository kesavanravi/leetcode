class Solution {
    public int maxFreqSum(String s) {
      String str="aeiou";
      String v="";
      String c="";
      for(int i=0;i<s.length();i++){
        if(str.contains(String.valueOf(s.charAt(i)))){
            v+=s.charAt(i);
        }
        else{
            c+=s.charAt(i);
        }
      }  
        int freqc[]=new int[26];
        int freqv[]=new int[26];
        for(int i=0;i<c.length();i++){
            freqc[c.charAt(i)-97]++;
        }
          for(int i=0;i<v.length();i++){
            freqv[v.charAt(i)-97]++;
        }
        int max1=0;
        int max2=0;
        for(int i=0;i<freqc.length;i++){
            if(freqc[i]>max1){
                max1=freqc[i];
            }
        }
        for(int i=0;i<freqv.length;i++){
            if(freqv[i]>max2){
                max2=freqv[i];
            }
        }
      return max1+max2;
    }
}