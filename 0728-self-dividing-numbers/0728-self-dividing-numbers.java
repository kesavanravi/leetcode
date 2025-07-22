class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int res=i;
            int count=0;
            while(res!=0){
                int dig=res%10;
                if(dig!=0&&i%dig==0) count++;
                res/=10;
            }
            int v=(int)Math.floor(Math.log10(i))+1;
            if(count==v) list.add(i);
        }
    return list; 
    }
}