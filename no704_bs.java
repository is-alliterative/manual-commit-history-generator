class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int middle = Math.round(start + (end - start)/2);

            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                end = middle - 1;
            }else if(nums[middle] < target){
                start = middle + 1;
            }

        }

    return -1;
        
        }
}