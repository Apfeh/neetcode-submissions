class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mapNumbers = new HashMap<Integer,Integer>();
        int[] frequent = new int[k];
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            mapNumbers.put(nums[i], mapNumbers.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new ArrayList<Integer>();
        }
        for(Map.Entry<Integer,Integer> map: mapNumbers.entrySet()){
            bucket[map.getValue()].add(map.getKey());
        }  
        int index = 0;
        for(int i = bucket.length - 1 ; i >= 0; i--){
            if(!bucket[i].isEmpty() && k > 0){
                for(int x = 0; x < bucket[i].size() && k > 0; x++){
                    frequent[index] = bucket[i].get(x);
                    index++;
                    k--;
                }
            }
        }
        return frequent;
    }
    
}
