class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(!st.isEmpty() && s.equals("+")){
                int a=st.pop();
                int b=a+st.peek();
                st.push(a);
                st.push(b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}