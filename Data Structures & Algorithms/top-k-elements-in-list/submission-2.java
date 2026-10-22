class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mapNumbers = new HashMap<Integer,Integer>();
        int[] frequent = new int[k];
        Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(), a.getValue()));
        for(int i = 0; i < nums.length; i++){
            mapNumbers.put(nums[i], mapNumbers.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> map: mapNumbers.entrySet()){
            queue.offer(map);
        }  
        for(int i = 0; i < frequent.length ; i ++){
            frequent[i] = queue.poll().getKey();
        }
        return frequent;
    }
    
}
