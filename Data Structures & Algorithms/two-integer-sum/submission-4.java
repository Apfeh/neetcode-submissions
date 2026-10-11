class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int lookingFor = target - nums[i];
            if(numsMap.get(lookingFor) == null){
                numsMap.put(nums[i],i);
            }else{
                returnArr[1] = i;
                returnArr[0] = numsMap.get(lookingFor);
                return returnArr; 
            }
        }
        return returnArr;
    }
}
 