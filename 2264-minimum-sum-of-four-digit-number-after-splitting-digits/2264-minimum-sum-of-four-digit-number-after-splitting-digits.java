class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> list=new ArrayList<>();
        while(num!=0){
            list.add(num%10);
            num/=10;
        }
        Collections.sort(list);
        int a=list.get(0)*10+list.get(2);
        int b=list.get(1)*10+list.get(3);
        return a+b; 
    }
}