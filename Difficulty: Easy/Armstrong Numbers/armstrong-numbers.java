class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int product = 0;
        int temp = n;
        for( ;temp > 0;){
            int y = temp % 10;
            product = product + y*y*y;
            temp = temp/10;
        }
        if(n == product){
            return true;
        }
        return false;
    }
}