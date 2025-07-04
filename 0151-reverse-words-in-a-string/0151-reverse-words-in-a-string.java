class Solution {
    public String reverseWords(String s) {
    String[] arr=s.split("\\s+");
    String str="";
    int start=0;
    int end=arr.length-1;
    while(start<end){
        String temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        } 
        for(int i=0;i<arr.length;i++){
            str+=arr[i]+" ";
        }
        return str.trim();
    }
}