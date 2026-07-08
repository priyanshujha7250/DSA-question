class Solution {
    public int[] plusOne(int[] digits) {
        // long num = 0L;
        // for(int i = 0;i<digits.length;i++){
        //     num = num*10 + digits[i];
        // }
        // num++;
        // String s = "" + num;
        // int arr[] = new int[s.length()];
        // for(int i = s.length()-1;i>=0;i--){
        //     long k = num%10;
        //     int j = (int)k;
        //     arr[i] = j;
        //     num = num/10;
        // }
        // return arr;

        // //19+1=20
        // //10+1=11
        // //9999 + 1=10000=>[9,9,9,9] =>[1,0,0,0,0]

        for(int i = digits.length-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
             digits[i] = 0;
        }
        int arr[] = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }
}