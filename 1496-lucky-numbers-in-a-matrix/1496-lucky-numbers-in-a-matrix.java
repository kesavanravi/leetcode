class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        ArrayList<Integer> list1=new ArrayList<>();
     for(int i=0;i<n;i++){
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            if(arr[i][j]<min){
                min=arr[i][j];
            }
        }
        list1.add(min);
     }   
      ArrayList<Integer> list2=new ArrayList<>();
     for(int j=0;j<m;j++){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
        list2.add(max);
     }  
      ArrayList<Integer> res=new ArrayList<>();
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j] == list1.get(i) && arr[i][j]==list2.get(j)){
                res.add(arr[i][j]);
            }
        }
     }
    return res; 
    }
}