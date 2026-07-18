class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1;
        for( int i = nums.length-1; i>0;i--){
            if(nums[i-1]<nums[i]){
                piv = i-1;
                break;
            }
        }
        if(piv != -1){
        for(int i = nums.length-1;i>piv;i--){
            if(nums[piv]<nums[i]){
                int temp = nums[i];
                nums[i] = nums[piv];
                nums[piv] = temp; 
                piv++;
            }
        }
        }
        
        int j = nums.length-1;
        
        if(piv == -1 ){
            piv = 0;
        }
        while(piv <= j){
            int temp = nums[piv];
            nums[piv] = nums[j];
            nums[j] = temp;
            piv++;
            j--;
        }
    }
}