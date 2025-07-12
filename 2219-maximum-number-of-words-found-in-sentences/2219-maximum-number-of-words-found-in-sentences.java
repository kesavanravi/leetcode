class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        int c=0;
        for(int i=0;i<s.length;i++){
            int res=s[i].split(" ").length;
            if(res>max){
                max=res;            
                }
        }
        return max;
    }
}