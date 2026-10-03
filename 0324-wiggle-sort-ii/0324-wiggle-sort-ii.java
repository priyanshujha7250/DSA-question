import java.util.Arrays;
class Solution {
    public void wiggleSort(int[] nums) {

        int s[] = nums.clone();
        for(int x: s)
                System.out.print(x + " ");
        System.out.println();
        Arrays.sort(s);
        for(int x: s)
                System.out.print(x + " ");
        int mid = (nums.length-1)/2;
        int high = (nums.length-1);
        for(int i =0;i<nums.length; i++)
        {
            if(i%2==0)
            {
                nums[i]=s[mid--];

            }

            else
            {
                nums[i]=s[high--];
            }

            
        }
        for(int x: nums)
                System.out.print(x + " ");
    }
}