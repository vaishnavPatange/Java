package in.lecture;

public class LastOccurrence {
        public static void main(String[] args) {
                int[] arr = {1, 2, 5, 7, 3, 5, 8, 3, 10, 1};
                int length = arr.length-1;
                System.out.println(lastOccurrenceInArray(arr, length, 98));
        }

        static int lastOccurrenceInArray(int[] arr, int i, int key){
                if(i < 0){
                       return -1;
                }
                if(arr[i] == key){
                        return i;
                }
                return lastOccurrenceInArray(arr, i-1, key);
        }

}
