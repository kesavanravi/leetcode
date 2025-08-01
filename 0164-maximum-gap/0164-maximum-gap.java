class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int res=nums[i+1]-nums[i];
            if(res>max){
                max=res;
            }
        }
        return max;
    }
}