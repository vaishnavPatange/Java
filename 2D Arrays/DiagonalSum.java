public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        // time complexity O(n^2)
        int Sum = 0;
        /*for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){
                    Sum += matrix[i][j];
                } else if(i+j == matrix.length-1){
                    Sum += matrix[i][j]; 
                }
            }
        }*/

        // time complexity O(n)
        for(int i=0; i<matrix.length; i++){
            // primary Diagonal
            Sum += matrix[i][i];
            // secondary Diagonal
            if(i != matrix.length-1-i){
            Sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(Sum);


    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16} };
        
        diagonalSum(matrix);
    }
    
}
