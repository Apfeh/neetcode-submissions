class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int lookingFor = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                if(lookingFor == nums[j] && i != j){
                    returnArr[0] = i; 
                    returnArr[1] = j;
                    return returnArr;
                }
            }
        }
        return returnArr;
    }
}
 