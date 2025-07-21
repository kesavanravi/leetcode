class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split("[^0-9]+");
        ArrayList<String> list=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
            if(arr[i]!=""){
                list.add(arr[i]);
                }
            }
            ArrayList<Integer> res=new ArrayList<>();
            for(String a:list){
                res.add(Integer.parseInt(a));
            }
            boolean flag=true;
        for(int i=0;i<res.size()-1;i++){
                if(res.get(i)>=res.get(i+1)){
                    flag=false;
                    break;
                 }
        }
        if(flag==true) return true;
        return false;
    }
}