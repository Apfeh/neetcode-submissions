class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hasDuplicate = new HashSet<>();
        for(int i = nums.length - 1; i >= 0; i--){
            if(hasDuplicate.add(nums[i]) ==  false){
                return true;
            }
        }
       return false; 
    }
}