class Solution {
    public String maximumOddBinaryNumber(String s) {
       char ch[]=s.toCharArray();
       int st=0;
       while(st<ch.length){
        if(ch[st]=='1'){
            char temp=ch[ch.length-1];
            ch[ch.length-1]=ch[st];
            ch[st]=temp;
            break;
        }   
        st++;
       }
        st=0;
       int end=0;
       while(st<ch.length-1 && end<ch.length-1){
         if(ch[end]=='1'){
            char temp=ch[st];
            ch[st]=ch[end];
            ch[end]=temp;
            st++;
        }   
        end++;
       }
    StringBuilder res=new StringBuilder();
    for(char c:ch){
        res.append(c);
    }
       return res.toString();
    }
}