class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int arr[][] = new int[m][n]; 
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                arr[j][i]=matrix[i][j];
                // int temp = matrix[i][j];
                // matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp;
            }
        }
        return arr;
    }
}