class Solution {
    public static int maxEvenOdd(int[] arr) {
        //  code here
        int maxcount = 1;
        int count = 1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] % 2 == 0 && arr[i+1] % 2 == 1){
                count++;
            }
            else if(arr[i] % 2 == 1 && arr[i+1] % 2 == 0){
                count++;
            }
            else{
                count = 1;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}