// class Solution {
//     public int removeDuplicates(int[] nums) {
//         //[9,9,8,8,7,7]
//         //[9,8,8,8,7,7]
//         //[9,8,7,8,7,7]

//         int j = 0; //j = 2
//         for(int i = 1;i<nums.length;i++){//i =2
//             if( nums[i] > nums[j]){
//                 j++;
//                 nums[j] = nums[i];
//             }
//         }
//         return j+1;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int newPlace = 0; //1st element is always gonna be unique
        for (int i = 1; i < nums.length; i++){
            if (nums[newPlace] < nums[i]){ //if different 
                newPlace++; //we now checking a different element 
                nums[newPlace] = nums[i]; 
            }
        }
    return newPlace + 1;
    }
}
