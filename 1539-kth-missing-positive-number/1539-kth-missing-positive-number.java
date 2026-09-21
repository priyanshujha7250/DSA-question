class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;//kth number nikalne ke liyea
        int index = 0;
        int j = 1;//
        while(count<k){
            if(index<arr.length && arr[index] == j){
                index++;
                j++;
            }
            else if(count + 1 == k){
                return j;
            }
            else{
                j++;
                count++;
            }
        }
        return j;
    }
}