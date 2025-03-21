public class SubArrays {
        public static void main(String[] args) {
                int[] num = {2, 3, 4, 5, 6, 7, 8};
//                printSubArrays(num);
                subArraySum(num);
        }


        public static void subArraySum(int[] arr){
                int sum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i; j < arr.length; j++) {
                                sum = 0;
                                for (int k = i; k <= j; k++) {
                                        System.out.print(arr[k] + " ");
                                        sum += arr[k];
                                }
                                maxSum = Math.max(sum, maxSum);
                                minSum = Math.min(sum, minSum);
                                System.out.print("        Sum = " + sum);
                                System.out.println();
                        }
                        System.out.println();
                }

                System.out.printf("Max sum of sub arrays is %d", maxSum);
                System.out.printf("\nMin sum of sub arrays is %d", minSum);
        }

        public static void printSubArrays(int[] arr){
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i; j < arr.length; j++) {
                                for (int k = i; k <= j; k++) {
                                        System.out.print(arr[k] + " ");
                                }
                                System.out.println();
                        }
                        System.out.println();
                }
        }

}
