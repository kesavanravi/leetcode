class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        for (String w : words) {
            if (match(w, pattern)) list.add(w);
        }
        return list;
    }

    private boolean match(String w, String p) {
        for (int i = 0; i < w.length(); i++) {
            if (w.indexOf(w.charAt(i)) != p.indexOf(p.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}