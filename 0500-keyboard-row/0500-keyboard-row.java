class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for(String word:words){
            int c1=0;
            int c2=0;
            int c3=0;
            for(char ch:word.toLowerCase().toCharArray()){
            if(s1.indexOf(ch)!=-1){
               c1++;
            }
            else if(s2.indexOf(ch)!=-1){
               c2++;
            }
            else if(s3.indexOf(ch)!=-1){
               c3++;
            }
            }
            if((c1!=0&&c2==0&&c3==0)||(c1==0&&c2!=0&&c3==0)||(c1==0&&c2==0&&c3!=0)){
                list.add(word);
            }
        }
        String[] arr=new String[list.size()];
        int j=0;
        for(int i=0;i<list.size();i++){
            arr[j++]=list.get(i);
        }
        return arr;
    }
}