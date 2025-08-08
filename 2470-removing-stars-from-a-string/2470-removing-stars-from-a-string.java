class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!st.isEmpty() && ch[i]!='*'){
                st.push(ch[i]);
            }
            else if(!st.isEmpty() && ch[i]=='*'){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}