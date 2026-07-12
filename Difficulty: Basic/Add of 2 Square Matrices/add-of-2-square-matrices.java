class Solution {
    public void addMat(int[][] a, int[][] b) {
        // code here
        // int c[][] = new int[a.length][a.length];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                a[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}