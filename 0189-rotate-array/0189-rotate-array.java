class Solution {
    public void rotate(int[] nums, int k) {
        // for(int i = 0;i<(k%nums.length);i++){
        //     int last = nums[nums.length-1];
        //     for(int j =nums.length -1; j>=1;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }

        // Optimal aproach
        k = k%nums.length;
        int temp[] = new int[nums.length];
        int t = 0;
        for(int i = nums.length - k;i<nums.length;i++){
            temp[t] = nums[i];
            t++;
        }
        for(int i = nums.length-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i = 0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}