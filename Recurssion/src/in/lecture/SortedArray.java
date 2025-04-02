package in.lecture;

public class SortedArray {
        public static void main(String[] args) {
                int[] arr = {1, 2, 3, 5, 7, 8, 10};
                System.out.println(isSorted2(arr, 0));
        }

        static boolean isSorted2(int[] arr, int i){
                if(i == arr.length-1){
                        return true;
                }

                if(arr[i] > arr[i+1]){
                        return false;
                }
                return isSorted(arr, i+1);
        }

        public static boolean isSorted(int[] arr, int i){
                if(i == arr.length - 1){
                        return true;
                }

                if(arr[i] < arr[i+1] && isSorted(arr, i+1) ){
                        return true;
                }
                return false;
        }

}
