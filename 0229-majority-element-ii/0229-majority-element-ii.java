import java.util.Arrays;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        Arrays.sort(nums);
        int num = nums[0];
        int freq = 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != num){
                if(freq > n){
                    al.add(num);
                }
                num = nums[i];
                freq = 1;
            }
            else{
                freq++;
            }
        }
        if(freq > n){
            al.add(num);
        }
        return al;
    }
}