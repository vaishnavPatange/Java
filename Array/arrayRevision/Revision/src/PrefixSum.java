import java.util.Arrays;

public class PrefixSum {
        public static void main(String[] args) {
                int[] arr = {2, -3, 4, 5, -6, 7, -8};
                preFixSubArraySum(arr);
        }

        public static void preFixSubArraySum(int[] arr){
                int sum = 0, maxSum = Integer.MIN_VALUE;
                int[] prefix = new int[arr.length];
                prefix[0] = arr[0];
                for (int i = 1; i < prefix.length; i++) {
                        prefix[i] = prefix[i-1] + arr[i];
                }

                for (int i = 0; i < arr.length; i++) {
                        for (int j = i; j < arr.length; j++) {
                                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                               maxSum = Math.max(sum, maxSum);
                        }
                }
                System.out.println("Max sum = " + maxSum);
        }

}
