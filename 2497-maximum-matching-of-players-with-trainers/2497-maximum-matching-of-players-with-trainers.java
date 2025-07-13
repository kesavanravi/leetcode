class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int st=0;
        int st1=0;
        int count=0;
        while(st<players.length&&st1<trainers.length){
            if(players[st]<=trainers[st1]){
                count++;
                st++;
                st1++;
            }
            else{
                st1++;
            }
        }
        return count;
    }
}