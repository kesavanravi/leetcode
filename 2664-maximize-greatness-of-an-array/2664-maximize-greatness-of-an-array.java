class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int r=0;
        int l=0;
        int count=0;
        while(r<nums.length&&l<nums.length){
            if(nums[r]>nums[l]){
                count++;
                l++;
            }
            
                r++;
        }
        return count;
    }
}