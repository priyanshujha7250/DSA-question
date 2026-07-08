import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int n = nums.length;
        if(num != 0){
            return 0;
        }
        for(int i = 0;i<n;i++){
            if(num == nums[i]){
                num++;
            }
            else if(num != nums[i]){
                return num;
            }
        }
        return num;
    }
}