class Solution {
    public void rotate(int[] nums, int k) {

         // Method 1


        // for(int i = 0;i<(k%nums.length);i++){
        //     int last = nums[nums.length-1];
        //     for(int j =nums.length -1; j>=1;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }

        // 2nd method

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


 // 3rd method and optiomal aproah


    //     int n = nums.length;
    //     k = k%n;
    //     reverse(nums,0,n-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,n-1);
    // }
    // public static void reverse(int arr[] ,int low ,int high){
    //     while(low<high){
    //         int temp = arr[low];
    //         arr[low] = arr[high];
    //         arr[high] = temp;
    //         low++;
    //         high--;
    //     }
    // }
 }