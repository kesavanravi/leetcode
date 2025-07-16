class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        int[] res=new int[n];
      Map<Integer,Integer> mp=new HashMap<>();
     for(int i=0;i<n;i++){
       mp.put(score[i][k],i);
       res[i]=score[i][k];
     }
     Arrays.sort(res);
     int b=res.length-1;
     int a[][]=new int[n][m];
     for(int i=0;i<n;i++){
        int val=b--;
        for(int j=0;j<m;j++){
            a[i][j]=score[mp.get(res[val])][j];
        }
     }
     return a;
    }
}