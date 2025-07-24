class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] res=new int[num_people];
        int j=1;
       for(int ind=0;candies>0;ind++){
        int i=ind%num_people;
        if(candies>=j){
            res[i]+=j;
            candies-=j;
            }
            else{
                res[i]+=candies;
                candies=0;
            }
            j++;
        }
        return res;
    }
}