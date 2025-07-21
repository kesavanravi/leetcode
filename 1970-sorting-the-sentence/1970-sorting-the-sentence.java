class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String ans[]=new String[arr.length];
        for(String a:arr){
            String res=" ";
            int n=0;
            for(int i=0;i<a.length();i++){
                char c=a.charAt(i);
                if(Character.isDigit(c)){
                    n=c-'1';
                }
                else{
                    res+=c;
                }
            }
            ans[n]=res;
        }
    String v="";
        for(String st:ans){
            v+=st;
        }  
    String [] a=v.split("\\s+");
    String c=" ";
    for(String x:a){
         c+=x+" ";
    }
  return c.trim();
    }
}