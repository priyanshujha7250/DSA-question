class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        int ans = 0;
        if(nums.length == 1){
            return nums[0];
        }
        while(left < right){
            mid = left + (right-left)/2;
            if(nums[mid]<nums[right]){
                ans = nums[mid];
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return nums[left];
    }
}