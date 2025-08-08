class Solution {
    public String sortVowels(String s) {
        String v="aeiouAEIOU";
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(v.contains(String.valueOf(s.charAt(i)))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(v.contains(String.valueOf(s.charAt(i)))){
                sb.append(String.valueOf(list.get(j++)));
                }
                else{
                 sb.append(s.charAt(i));
                }
            }
        return sb.toString();
    }
}