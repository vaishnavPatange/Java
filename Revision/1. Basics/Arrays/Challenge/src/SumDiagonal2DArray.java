class SumDiagonal2DArray {
        public static void main(String[] args) {
                int[][] arr = ArrayUtility.twoDArrayInput();
                if( arr.length != arr[0].length){
                        System.out.println("To calculate sum of diagonal elements rows and columns of array must be same !!!");
                } else{
                        int sum = diagonalSum(arr);
                        System.out.println("Sum of all the diagonal elements is : " + sum);
                }
        }

        public static int diagonalSum(int[][] arr) {
                int sumOfLeftDiagonal = leftDiagonalSum(arr);
                int sumOfRightDiagonal = rightDiagonalSum(arr);
                int sum = sumOfLeftDiagonal + sumOfRightDiagonal ;
                if(arr.length % 2 != 0){
                        int ind = (arr.length - 1)/2 ;
                        sum -= arr[ind][ind];
                }
                return sum;
        }

        public static int leftDiagonalSum(int[][] arr) {
                int sum = 0;
                int i=0;
                while( i < arr.length){
                        sum += arr[i][i];
                        i++;
                }
                return sum;
        }

        public static int rightDiagonalSum(int[][] arr) {
                int sum = 0;
                int i = 0;
                while( i < arr.length){
                        int col = arr.length - 1 - i;
                        sum += arr[i][col];
                        i++;
                }
                return sum;
        }

}
