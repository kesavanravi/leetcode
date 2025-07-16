class Solution {
    public int maximumLength(int[] nums) {
        int c1=0;int c2=0;
        int ac=0;
        int p=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                c1++;
                if(p==1 || p==-1) ac++;
            }
            else{
                c2++;
                if(p==0 || p==-1) ac++;
            }
            p=nums[i]%2;
        }
    return Math.max(ac,Math.max(c1,c2));
    }
}