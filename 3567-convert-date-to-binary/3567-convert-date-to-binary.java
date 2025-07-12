class Solution {
    public String convertDateToBinary(String date) {  
        String[] arr=date.split("-");
        String res="";
        for(int i=0;i<arr.length;i++){
         res+=Integer.toBinaryString(Integer.parseInt(arr[i]))+"-";
        }
        return res.substring(0,res.length()-1);

    }
}