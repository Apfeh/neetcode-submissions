class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        Character c;
        int count;
        if(t.length() != s.length()){return false;}

        for(int i = 0; i < s.length(); i++){
            if(sMap.computeIfPresent(s.charAt(i),(key, size) -> size + 1) == null){
                sMap.put(s.charAt(i),1);
            }
        }
        

        for(int x = 0; x < t.length(); x++){
            c = t.charAt(x);
            if(sMap.get(c) == null){
                return false;
            }
            count = sMap.get(c);
            if(count == 1){
                sMap.remove(c);
            }else{
                sMap.put(c, count - 1);
            }
        }
        return sMap.isEmpty();
    }
}
