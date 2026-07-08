class Solution {
    public int removeDuplicates(int[] nums) {
        //[9,9,8,8,7,7]
        //[9,8,8,8,7,7]
        //[9,8,7,8,7,7]

        int j = 1; //j = 2
        for(int i = 1;i<nums.length;i++){//i =2
            if( nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}