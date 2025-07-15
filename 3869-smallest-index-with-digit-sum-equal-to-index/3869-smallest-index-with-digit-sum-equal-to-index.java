class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int res=nums[i];
            int sum=0;
            while(res!=0){
                int dig=res%10;
                sum+=dig;
                res/=10;
            }
            if(sum==i){
                return i;
            }
            sum=0;
        }
        return  -1;
    }
}