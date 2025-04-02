public class GridWaysFormula {
        public static void main(String[] args) {
                int[][] arr = new int[3][3];
                int row = arr.length;
                int col = arr[0].length;
                long totalWays =  (factorial((row+col-2)) / (factorial(row-1) * factorial(col-1)));
                System.out.println("Total ways: " + totalWays);

                /*
                total ways = (n-1 + m-1) ! / (n-1) ! * (m-1) !
                hew n = row and m = col
                 */

        }

        public static long factorial(int num){
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                        fact *= i;
                }
                return fact;
        }

}
