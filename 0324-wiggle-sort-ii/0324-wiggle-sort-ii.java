import java.util.Arrays;
class Solution {
    public void wiggleSort(int[] nums) {
        // for(int i = 0;i<nums.length-1;i++){
        //     if(i%2 == 1){
        //         if(nums[i]<nums[i+1]){
        //             int temp = nums[i];
        //             nums[i] = nums[i+1];
        //             nums[i+1] = temp;
        //         }
        //     }
        //     else{
        //         if(nums[i]>nums[i+1]){
        //             int temp = nums[i];
        //             nums[i] = nums[i+1];
        //             nums[i+1] = temp;
        //         }
        //     }
        // }
        // for(int i = 0;i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }

        // Step 1: Create a frequency bucket array since 0 <= nums[i] <= 5000
        int[] bucket = new int[5001];
        for (int num : nums) {
            bucket[num]++;
        }
        
        int n = nums.length;
        int maxVal = 5000; // Start with the largest possible number
        
        // Step 2: Fill the peaks (odd indices: 1, 3, 5...)
        for (int i = 1; i < n; i += 2) {
            while (bucket[maxVal] == 0) {
                maxVal--;
            }
            nums[i] = maxVal;
            bucket[maxVal]--;
        }
        
        // Step 3: Fill the valleys (even indices: 0, 2, 4...)
        for (int i = 0; i < n; i += 2) {
            while (bucket[maxVal] == 0) {
                maxVal--;
            }
            nums[i] = maxVal;
            bucket[maxVal]--;
        }

    }
}
        // int s[] = nums.clone(); // time complexity O(n)
        // Arrays.sort(s);[4,4,4,4,5,5,5]// time complexity O(n log(n))
        // int mid = (nums.length-1)/2;
        // int high = (nums.length-1);
        // for(int i =0;i<nums.length; i++) // time complexity  O
        // {
        //     if(i%2==0)
        //     {
        //         nums[i]=s[mid--];

        //     }

        //     else
        //     {
        //         nums[i]=s[high--];
        //     }
        // }
        // for(int x: nums)
        //         System.out.print(x + " ");