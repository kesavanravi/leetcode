class Solution {
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                count++;
            }
        }
        return count;
    }
}