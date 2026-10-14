class Solution {
    public void moveZeroes(int[] nums) {
        //int j = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            // if(nums[j] == 0 && nums[i] != 0){
            //     nums[j] = nums[i];
            //     nums[i] = 0;
            //     j++;
            // }
            // else if(nums[j] != 0){
            //     j++;
            // }
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i = j;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}