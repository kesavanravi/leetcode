class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch=='B' && st.peek()=='A' || ch=='D' && st.peek()=='C'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        return str.length();
    }
}