package in.important;

public class TilingProblem {
        public static void main(String[] args) {
                System.out.println(tilingWays(6));
        }

        static int tilingWays(int num){
                if(num == 1 || num ==0){
                        return 1;
                }
                int horizontalWays = tilingWays(num-2);
                int verticalWays = tilingWays(num-1);
                return horizontalWays + verticalWays;
        }

}
