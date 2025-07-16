class Solution {
    public int[] decrypt(int[] code, int k) {
     int n=code.length;
     int res[]=new int[code.length];
     if(k==0){
         return res;
     }
         int st=1;
         int end=k;
         int sum=0;
    if(k<0){
        k=-k;
         st=n-k;
         end=n-1;
        }
        for(int i=st;i<=end;i++){
            sum+=code[i%n];
        }
        for(int i=0;i<code.length;i++){
            res[i]=sum;
            sum-=code[st%n];
            st++;
            end++;
            sum+=code[end%n];
        }
        return res;
    }
}