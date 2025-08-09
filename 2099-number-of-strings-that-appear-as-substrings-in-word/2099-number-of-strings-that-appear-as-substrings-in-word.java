class Solution {
    public int numOfStrings(String[] patterns, String s) {
    int c=0;
    for(int i=0;i<patterns.length;i++){
        if(s.indexOf(patterns[i])!=-1){
            c++;
        }
    }
       return c;
     }
}