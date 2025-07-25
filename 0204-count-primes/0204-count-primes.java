class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean [] arr=new boolean[n];
        Arrays.fill(arr,true);
       arr[0]=arr[1]=false;
        for(int i=2;i*i<n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
        if(arr[i]==true){
            count++;
            }
        }
        return count;
    }
}