class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int st=0;
        int end=0;
        int count=0;
        while(st<g.length&&end<s.length){
            if(g[st]<=s[end]){
                count++;
                st++;
                end++;
            }
            else{
                end++;
            }
        }
        return count;
    }
}