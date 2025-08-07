class Solution {
    public String largestOddNumber(String num) {
        //1250 --> 125
        for(int i=num.length()-1;i>=0;i--){
            int res= num.charAt(i)-'0';
            if(res%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}