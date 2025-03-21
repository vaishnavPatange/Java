public class PairsInArray {
        public static void main(String[] args) {
                int[] num = {2, 3, 4, 5, 6, 7, 8};
                printPairs(num);
        }

        public static void printPairs(int[] arr){
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                        for (int j = i+1; j < arr.length; j++) {
                                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                                count++;
                        }
                        System.out.println();
                }
                System.out.println("total pairs are = " + count);
        }

}