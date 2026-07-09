class Solution {
    public static boolean checkNO(int num){
        String str = "" + num;
        int n = str.length()-1;
        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }
    
    public static boolean isPalinArray(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            if(checkNO(arr[i]) == false){
                return false;
            }
        }
        return true;
    }
}