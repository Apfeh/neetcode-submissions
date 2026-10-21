class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groupAnagrams = new HashMap<String,List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            groupAnagrams.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(groupAnagrams.values());

    }
}
