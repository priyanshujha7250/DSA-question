class Solution {
    public int majorityElement(int[] nums) {
        //[1,2,1,2,3,1]
        Arrays.sort(nums);
        int recur = nums[0];
        int j = 1;
        for(int i = 1; i<nums.length;i++){
            if(j<= (nums.length/2) && recur != nums[i]){
                recur = nums[i];
                j=1;
            }
            else if(recur == nums[i]){
                j++;
            }
            else if(j > (nums.length/2) && recur !=nums[i]){
                break;
            }
        }
        return recur;
    }
}