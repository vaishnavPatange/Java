public class GridWays {
        public static void main(String[] args) {
                int[][] arr = new int[4][4];
                System.out.println("total ways: " + findWays(arr, 0, 0));
        }

        public static int findWays(int[][] arr, int i, int j){
           if(i == arr.length-1 && j == arr.length-1){
                   return 1;
           } else if(i >= arr.length || j >= arr.length){
                   return 0;
           }
           int w1 = findWays(arr, i, j+1);
           int w2 = findWays(arr, i+1, j);
           return w1+w2;

        }


}
