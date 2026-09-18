class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        int mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid] == 0){
                left = mid + 1;
            }
            else if(arr[mid] == 1){
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}