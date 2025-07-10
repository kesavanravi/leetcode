class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int freq1[]=new int[102];
        int freq2[]=new int[102];
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-97]++;
        }
        for(int i=0;i<word2.length();i++){
            freq2[word2.charAt(i)-97]++;
        }
        int [] res=new int[freq1.length+freq2.length];
        int j=0;
        for(int i=0;i<freq1.length;i++){
            res[j]=Math.abs(freq1[i]-freq2[i]);
            j++;
        }
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i]>3){
                return false;
            }
        }
        return true;
        // if(count>=1){
        //     return ;
        // }
        // return true;
    }
}