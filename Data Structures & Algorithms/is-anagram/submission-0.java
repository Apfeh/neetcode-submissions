class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            letterCount.put(sChar, letterCount.getOrDefault(sChar,0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            char tChar = t.charAt(i);
            if(letterCount.get(tChar) == null){
                return false;
            }

            int value = letterCount.get(tChar);
            if(value == 1){
                letterCount.remove(tChar);
            }else{
                letterCount.put(tChar, value - 1);
            }
        }
        if(letterCount.isEmpty()){
            return true;
        }

        return false;
    }
}
