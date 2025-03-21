public class KadanesAlgorithm {
        public static void main(String[] args) {
                int[] arr = {-2, -3, -4, -5, -6, -7, -8};
                kadanes(arr);
        }

        public static void kadanes(int[] arr){
                int currSum = 0, maxSum = Integer.MIN_VALUE;

                for (int i = 0; i < arr.length; i++) {
                        currSum += arr[i];
                        if(currSum < 0) currSum = 0;
                        maxSum = Math.max(currSum, maxSum);
                }
                if(maxSum == 0){
                        maxSum = Integer.MIN_VALUE;
                        for (int i = 0; i < arr.length; i++) {
                                maxSum = Math.max(maxSum, arr[i]);
                        }
                }

                System.out.printf("Max sum = %d", maxSum);

        }

}
