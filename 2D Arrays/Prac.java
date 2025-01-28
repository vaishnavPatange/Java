public class Prac {
    public static int seven(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int SumRow(int nums[][]){
        int i = 1;
        int sum = 0;
        for(int j=0; j<nums[0].length; j++){
            sum += nums[i][j];
        }
        return sum;
    }

    public static void transpose(int array[][]){
        int transArray[][] = new int[array[0].length][array.length];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                transArray[j][i] = array[i][j];
            }
        }

        for(int row=0; row<transArray.length; row++){
            for(int col=0; col<transArray[0].length; col++){
                System.out.print(transArray[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int array[][] = {{4, 5, 6}, {7, 8, 9}};
        transpose(array);
    }
}
