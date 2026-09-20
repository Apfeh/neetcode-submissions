class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int[] returnIndice = new int[2];

        for(int i = 0; i < nums.length; i++){
            int searchFor = target - nums[i];
            // 7 - 3 = 4 
            if(indexMap.get(searchFor) == null){
                indexMap.put(nums[i],i); //(3,0)
            }else{
                returnIndice[0] = indexMap.get(searchFor);
                returnIndice[1] = i;
                return returnIndice; 
            }
        }
        return returnIndice;
    }
}
