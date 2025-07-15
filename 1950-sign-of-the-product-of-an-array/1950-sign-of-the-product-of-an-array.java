class Solution {
    public int arraySign(int[] nums) {
        int pr=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                 return 0;
            }
            if(nums[i]>0){
                nums[i]=1;
            } 
            else if(nums[i]<0){
                nums[i]=-1;
            }
            pr*=nums[i];
        }
        return signFunc(pr);
    }
    public static int signFunc(int pr){
        if(pr>0) return 1;
        else if(pr<0) return -1;
        return 0;
    }
}