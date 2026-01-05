/*

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                swap(matrix, i, j, j, i);
            }
        }
        reverseRows(matrix);
    }
    private void swap(int[][] matrix, int r1, int c1, int r2, int c2){
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
    private void reverseRows(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int left = 0, right = n-1;
            while(left < right){
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }
    }
}


*/