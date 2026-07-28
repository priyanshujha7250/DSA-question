class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int upper = 0;//1 ->
        int lower = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(upper<=lower && left <=right){
            for(int i = left;i<=right;i++){
                al.add(matrix[upper][i]);
            }
            upper++;
            for(int i = upper;i<=lower;i++){
                al.add(matrix[i][right]);
            }
            right--;
            if(upper<=lower){
            for(int i = right ;i>=left;i--){
                al.add(matrix[lower][i]);
            }
            lower--;
            }
            if(left <= right){
            for(int i = lower ;i>=upper;i--){
                al.add(matrix[i][left]);
            }
            left++;
            }
        }
        return al;
    }
}