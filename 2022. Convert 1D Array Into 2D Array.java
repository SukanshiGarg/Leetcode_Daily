class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //Edge case when the number of elements in the 1-D array
        // is more than size of the 2D Arrays
        if(original.length != m*n){
            return new int[0][0];
        }

        //Make a new 2-D Array 
        int result[][]=new  int[m][n];

        //looping to store elements at their correct position
        for(int i=0 ;i<original.length;i++){
            int row=i/n;
            int col=i%n;
            result[row][col]=original[i];
        }
        return result;

}
}
