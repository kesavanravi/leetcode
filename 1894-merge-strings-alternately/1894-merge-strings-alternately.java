class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        char[] res=new char[word1.length()+word2.length()];
         int i = 0, j = 0;
    for (int k = 0; k < res.length; k++) {
        if (k % 2 == 0 && i < ch1.length) {
            res[k] = ch1[i++];
        } else if (j < ch2.length) {
            res[k] = ch2[j++];
        
        } else if (i < ch1.length) {
            res[k] = ch1[i++];
        }
    }
    return new String(res);
    }
}