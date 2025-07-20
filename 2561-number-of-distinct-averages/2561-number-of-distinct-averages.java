class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;
        ArrayList<Double> list=new ArrayList<>();
        while(st<end){
            double res=(nums[st]+nums[end])/2.0;
            if(!list.contains(res)){
                list.add(res);
            }
            st++;
            end--;
        }
    return list.size();
    }
}