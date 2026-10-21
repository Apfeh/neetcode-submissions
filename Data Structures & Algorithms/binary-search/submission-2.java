class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }
    public int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = low + (high - low)/2;
            int value  = array[middle];

            if(value < target) low = middle + 1;
            else if(value > target) high = middle -1;
            else return middle;
        }
        return -1;
    }
}
