class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int recur = nums[0];
        int j = 1;
        boolean b = false;
        for(int i = 1; i<nums.length;i++){
            if(j>1 && recur != nums[i]){
                b = true;
            }
            else if(recur == nums[i]){
                j++;
            }
            else if(j == 1 && recur !=nums[i]){
                recur = nums[i];
                j=1;
            }
        }
        if(j > 1 ){
            return true;
        }
        return b;
    }
}