class Solution {
    public boolean isValid(String s) {
        if(s.length()<3) return false;
        String str="AEIOUaeiou";
        int v=0;
        int a=0;
        int dig=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                 if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                     dig++;
                }
            else if(str.contains(String.valueOf(s.charAt(i)))){
                v++;
            }
            else if(!str.contains(String.valueOf(s.charAt(i)))){ 
                a++;
            } 
            }
            else{
                return false;
            }
        }
        if(v>=1&&a>=1&&(dig>=1||dig==0)){
            return true;
        }
        return false;
    }
}