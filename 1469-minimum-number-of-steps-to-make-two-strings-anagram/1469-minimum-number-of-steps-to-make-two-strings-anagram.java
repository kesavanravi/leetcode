class Solution {
    public int minSteps(String s, String t) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int sum=0;
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-97]++;
        } 
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(freq1));
        System.out.println(Arrays.toString(freq2));        
       // int count=0;
        for(int i=0;i<freq1.length;i++){
            if(freq2[i]<freq1[i]){
                sum+=freq1[i]-freq2[i];
            }
        }
        return sum;
    }
}