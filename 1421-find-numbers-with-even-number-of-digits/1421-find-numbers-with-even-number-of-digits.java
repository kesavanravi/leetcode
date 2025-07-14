class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        int res=nums[i];
        list.add(String.valueOf(res).length());
       } 
       int count=0;
       for(int i=0;i<list.size();i++){
        if(list.get(i)%2==0){
            count++;
        }
       }
       return count;
    }
}