class Solution {
    public boolean hasDuplicate(int[] nums) {
       
        HashSet<Integer> seenbefore = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!seenbefore.add(nums[i])){
                return true;
            }
        }     
        return false;
    }
}