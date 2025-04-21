public class BinarySearch {

        public static boolean binarySearch(int[] arr, int key){
                int start = 0 , end = arr.length-1;
                while(start <= end){
                        int mid = (start + end)/2;
                        if(arr[mid] == key){
                                return true;
                        }
                        if(key > mid){
                                start = mid+1;
                        }
                        if(key < mid){
                                end = mid - 1;
                        }
                }
                return false;
        }

        public static void main(String[] args) {
                int[] arr = {2, 6, 8, 10, 67, 123, 150};
                System.out.println(binarySearch(arr, 1293));
        }

}
