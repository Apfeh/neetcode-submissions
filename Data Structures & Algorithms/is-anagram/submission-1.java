class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        int count;
        if(t.length() != s.length()){return false;}

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c,0) + 1);
        }
        

        for(int x = 0; x < t.length(); x++){
            char c = t.charAt(x);
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
