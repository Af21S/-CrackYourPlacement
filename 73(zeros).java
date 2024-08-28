public class Solution {
    public void setZeroes(int[][] matrix) {
        // int cols=matrix.length;
        // int rows=matrix[0].length;
        // boolean [][]arr=new boolean[cols][rows];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0){
        //             arr[i][j]=true;
        //         }
        //         else{
        //             arr[i][j]=false;
        //         }
        //     }
        // }

 int cols = matrix.length;
        int rows = matrix[0].length;
        boolean[] zeroRows = new boolean[cols];
        boolean[] zeroCols = new boolean[rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true; 
                    zeroCols[j] = true; 
                }
            }
        }

    
        for (int i = 0; i < cols; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < rows; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < rows; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < cols; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(arr[i][j]==true){
        //             for(int k=0;k<matrix[0].length;k++){
        //             matrix[k][cols]=0;
        //             matrix[rows][k]=0;}
        //         }
        //     }
        // }


    //     int row=0;
    //     int col=0;
    //     for (int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[i].length;j++){
    //             if (matrix[i][j]==0){
    //                 row=i;
    //                 col=j;
    //                 zero(row,col,matrix);
                    
    //             }
    //         }
    //     }
        
    // }

    // public void zero(int row, int col, int [][] matrix){
    //     for(int i=0;i<matrix[row].length;i++){
    //         matrix[row][i]=0;
    //     }
    //      for(int i=0;i<matrix[0][col].length;i++){
    //         matrix[i][col]=0;
    //     }
        

    }
} 
