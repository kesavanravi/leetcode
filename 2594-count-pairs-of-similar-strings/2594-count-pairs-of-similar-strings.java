class Solution {
    public int similarPairs(String[] words) {
        List<Set<Character>> list = new ArrayList<>();
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) {
                set.add(c);
            }
            list.add(set);
        }
        
        int count=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
        }
        return count;
    }
}