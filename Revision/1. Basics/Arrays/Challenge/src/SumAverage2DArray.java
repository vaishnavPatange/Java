class SumAverage2DArray {
        public static void main(String[] args) {
                int[][] arr = ArrayUtility.twoDArrayInput();
                int sum = sum2DArray(arr);
                int avg = average2DArray(arr, sum);
                System.out.println("The sum of all the elements in the array is : " + sum);
                System.out.println("The average of all the elements in the array is : " + avg);

        }

        public static int average2DArray(int[][] arr, int sum){
                int arrSize = arr.length * arr[0].length;
                System.out.println(arrSize);
                int avg = sum/arrSize;
                return avg;
        }

        public static int sum2DArray(int[][] arr){
                int sumElements = 0;
                for(int i=0; i<arr.length; i++){
                        for(int j=0; j<arr[0].length; j++){
                                sumElements += arr[i][j];
                        }
                }
                return sumElements;
        }

}
