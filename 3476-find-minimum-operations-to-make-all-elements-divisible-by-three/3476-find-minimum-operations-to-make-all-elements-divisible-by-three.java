class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int c1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
             else if(nums[i]%3==0){
                c1++;
            }
        }
        if(nums.length==c1) return 0;
        return count;
    }
}