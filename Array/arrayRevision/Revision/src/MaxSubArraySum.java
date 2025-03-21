public class MaxSubArraySum {
        public static void main(String[] args) {
                int[] num = {2, -3, 4, 5, -6, 7, -8};
                maxSum(num);
        }

        public static  void maxSum(int[] arr){
                int sum = 0;
                int maxSum = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i; j < arr.length; j++) {
                                sum = 0;
                                for (int k = i; k <= j; k++) {
                                        sum += arr[k];
                                }
                                maxSum = Math.max(sum, maxSum);
                        }
                }
                System.out.println("Max sub array sum : " + maxSum);
        }

}
