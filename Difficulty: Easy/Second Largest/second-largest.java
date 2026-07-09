class Solution {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(max<arr[i] ){
                smax = max;
                max=arr[i];
                
            } 
            else if(smax<arr[i] && arr[i] < max){
                smax = arr[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            return -1;
        }
        return smax;
    }
}