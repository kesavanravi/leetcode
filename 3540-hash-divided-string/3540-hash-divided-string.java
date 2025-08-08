class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        if (k==1) return s;
        if(s.length()==k){
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=s.charAt(i)-97;
            }
            return String.valueOf((char)(sum%26+97));
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length()-1;i+=k){
                list.add(s.substring(i,i+k));
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<list.size();i++){
            int ans=0;
            char c=0;
            for(int j=0;j<list.get(i).length();j++){
            ans+=list.get(i).charAt(j)-97;
             c=(char)(ans%26+97);
            }
            res.append(c);
        }
        return res.toString();
    }
}