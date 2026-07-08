class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;//2*10^9
        int max = 0;
        int curr = 0;
        for(int i = 0;i<prices.length;i++){
            if(min>prices[i]){// [1,2,3]
                min=prices[i]; 
            }
            curr=prices[i]-min;
            if(curr>max){
                max=curr;
            }
        }
        return max;
    }
}