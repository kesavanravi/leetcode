class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        double s=0;
        if(list.size()%2!=0){
            s=list.get(list.size()/2);
        }
        else{
            int a=list.get(list.size()/2);
            int b=list.get(list.size()/2-1);
            double res=(a+b)/2.0;
            s=res;
        }
        return s;
    }
}