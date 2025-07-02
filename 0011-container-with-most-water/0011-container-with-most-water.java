class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int max=0;
        while(st<end){
                int m=Math.abs((Math.min(height[st],height[end]))*(st-end));
                max=Math.max(m,max);
                if(height[st]<=height[end]){
                    st++;
                }
                else{
                    end--;
                }
        }
    return max;
    }
}