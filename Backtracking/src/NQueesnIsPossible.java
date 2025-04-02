public class NQueesnIsPossible {

        public static void main(String[] args) {
                int n = 4;
                char[][] chess = new char[n][n];
                for (int i = 0; i < chess.length; i++) {
                        for (int j = 0; j < chess[i].length; j++) {
                                chess[i][j] = 'X';
                        }
                }
               if(nQueens(chess, 0)){
                       System.out.println("Solution is possible");
                       printChess(chess);
                } else {
                       System.out.printf("\nsolution is not possible");
               }
        }

        public static boolean nQueens(char[][] chess, int row){
                if(row == chess.length){
                        return true;
                }

                for (int i=0; i<chess.length; i++){
                        if(isSafe(chess, row, i)){
                                chess[row][i] = 'Q';
                                if(nQueens(chess, row+1)){
                                        return true;
                                }
                                chess[row][i] = 'X';
                        }
                }
                return false;
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
