class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int con = 0;
        int maxcon = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1){
                con++;
                if(maxcon<con){
                    maxcon = con;
                }
            }
            
            else{
                con = 0;
            }
        }
        return maxcon;
    }
}