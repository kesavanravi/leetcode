class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int top=0;
     int bot=matrix.length-1;
     int left= 0;
     int right=matrix[0].length-1;
     ArrayList<Integer> list=new ArrayList<>();
     while(top<=bot && left<=right){
        for(int c=left;c<=right;c++){
           list.add(matrix[top][c]); 
        }
        top++;
        for(int r=top;r<=bot;r++){
            list.add(matrix[r][right]);
        }
        right--;
        if(top<=bot){
            for(int c=right;c>=left;c--){
                list.add(matrix[bot][c]);
            }
        }
        bot--;
        if(left<=right){
            for(int r=bot;r>=top;r--){
                list.add(matrix[r][left]);
            }
        }
        left++;
     }  
     return list; 
    }
}