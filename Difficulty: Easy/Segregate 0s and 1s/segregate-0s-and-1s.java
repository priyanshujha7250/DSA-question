class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                arr[j] = 0;
                arr[i] = 0;
                j++;
            }
        }
        for(int i = arr.length-j;i<arr.length;i++){
            arr[i] = 1;
        }
    }
}
