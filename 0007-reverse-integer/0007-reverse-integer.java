class Solution {
    public int reverse(int x) {
        double d = 0;
        while(x!=0){
            d = d*10 + x%10;
            x = x/10;
        }
        if(d>Integer.MAX_VALUE || d<Integer.MIN_VALUE){
            return 0;
        }
        return (int)d;
    }
}