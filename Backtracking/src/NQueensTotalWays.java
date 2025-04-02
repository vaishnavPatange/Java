public class NQueensTotalWays {

        public static void main(String[] args) {
                int n = 7;
                char[][] chess = new char[n][n];
                for (int i = 0; i < chess.length; i++) {
                        for (int j = 0; j < chess[i].length; j++) {
                                chess[i][j] = 'X';
                        }
                }
                nQueens(chess, 0);
                System.out.println("Total solutions = " + totalSolutions);
        }

        static int totalSolutions = 0;

        public static void nQueens(char[][] chess, int row){
                if(row == chess.length){
                        totalSolutions++;
                        return;
                }

                for (int i=0; i<chess.length; i++){
                        if(isSafe(chess, row, i)){
                                chess[row][i] = 'Q';
                                nQueens(chess, row+1);
                                chess[row][i] = 'X';
                        }
                }

        }

        public static boolean isSafe(char[][] arr, int row, int col){
                // vertically up
                for (int i=row-1; i>=0; i--){
                        if(arr[i][col] == 'Q') return false;
                }

                // diagonally left
                for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
                        if(arr[i][j] == 'Q') return false;
                }

                // diagonally right
                for(int i=row-1, j=col+1; i>=0 && j<arr[i].length; i--, j++){
                        if(arr[i][j] == 'Q') return false;
                }
                return true;
        }

        public static void printChess(char[][] chess){
                for (int i = 0; i < chess.length; i++) {
                        for (int j = 0; j < chess[i].length; j++) {
                                System.out.print(chess[i][j] + "   ");
                        }
                        System.out.println();
                }
        }



}
