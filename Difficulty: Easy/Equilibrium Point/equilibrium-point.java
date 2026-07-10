class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        int leftSum=0;
        for(int i =0;i<arr.length;i++){
            if(leftSum == sum-arr[i]){
                return i;
            }
            leftSum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }
}
