class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int copy=x;  
        while(copy!=0){
            int dig=copy%10;
            sum+=dig;
            copy/=10;
        }
        if(x%sum==0) return sum;
        return -1;
    }
}