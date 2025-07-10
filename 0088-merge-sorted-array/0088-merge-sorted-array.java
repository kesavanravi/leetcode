class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] arr=new int[n+m];
    int j=0;
    int k=m;
    for(int i=0;i<nums1.length;i++){
        arr[j]=nums1[i];
        j++;
    }
    for(int i=0;i<nums2.length;i++){
        arr[k]=nums2[i];
        k++;
    }
    Arrays.sort(arr);
    for(int i=0;i<nums1.length;i++){
        nums1[i]=arr[i];
            } 
    }
}