class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder();
     if(strs.length==0){
        return "";
     }
     String a=strs[0]; 
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch){
                    return str.toString();
                }
            }
            str.append(ch);
        }
        return str.toString();
    }
}