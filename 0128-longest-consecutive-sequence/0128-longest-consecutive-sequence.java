class Solution {
    public int longestConsecutive(int[] nums) {
      int count=1;
      int max=1;
      if(nums.length==0) return 0;
      if(nums.length==1) return 1;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]) continue;
        if(nums[i]+1==nums[i+1]){
            count++;
        }
        else{
            count=1;
        }
        if(count>max){
        max=count;
    }
    }    
    return max;
    }
}