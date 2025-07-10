class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                list.add(letters[i]);
                break;
            }
        }
        for(char c:list){
            ch=c;
        }
        return ch;
    }
}