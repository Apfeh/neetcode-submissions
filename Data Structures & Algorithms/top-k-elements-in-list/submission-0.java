class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mapNumbers = new HashMap<Integer,Integer>();
        int[] frequent = new int[k];
        for(int i = 0; i < nums.length; i++){
            mapNumbers.put(nums[i], mapNumbers.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < frequent.length ; i++){
            int frequentKey = Collections.max(mapNumbers.entrySet(),Map.Entry.comparingByValue()).getKey();
            frequent[i] = frequentKey;
            mapNumbers.remove(frequentKey); 
        }    
        return frequent;
    }
    
}
