class Solution {
    static int findFloor(int[] arr, int x) {
        for(int i = arr.length-1;i>=0;i--){
            if(x>=arr[i]){
                return i;
            }
        }
        return -1;

    }
}
