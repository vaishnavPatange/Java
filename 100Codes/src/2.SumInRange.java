class SumInRange {
        public static void main(String[] args) {

                //recursion approach
                System.out.println(recurSum(5, 10));
        }

        public static int recurSum(int i, int b){
                if(i == b) return i;
                return b + recurSum(i, b-1);
        }

}
