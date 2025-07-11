class Solution {
    public int smallestEvenMultiple(int n) {
        int m=2;
        int val=n*m;
        int l=0;
        for(int i=2;i<=val;i++){
            if(i%n==0&&i%m==0){
                l=i;
                break;
            }
        }
        return l;
    }
}