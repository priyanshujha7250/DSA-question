import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        //[1,2,1,3,4,3,2,1]
        //[1,1,1,2,2,3,3,4,5,5]
        Arrays.sort(nums);
        int recur = nums[0];
        int j = 1;// 2
        //recur = 4
        //nums[i] = 5 ; j == 1
        for(int i = 1; i<nums.length;i++){
            if(j>1 && recur != nums[i]){
                recur = nums[i];
                j=1;
            }
            else if(recur == nums[i]){
                j++;
            }
            else if(j == 1 && recur !=nums[i]){
                break;
            }
        }
        return recur;
    }
}