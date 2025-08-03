class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int dig=nums[i]%10;
                s+=dig;
                nums[i]/=10;
            }
        }
        return Math.abs(sum-s);
    }
}