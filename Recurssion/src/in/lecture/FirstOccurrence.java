package in.lecture;

public class FirstOccurrence {
        public static void main(String[] args) {
                int[] arr = {1, 2, 5, 7, 3, 5, 8, 3, 10, 1};
                System.out.println(occurrenceInArray(arr, 0, 85));
        }

        static int occurrenceInArray(int[] arr, int i, int key){
                if(i >= arr.length){
                        return -1;
                }
                if(arr[i] == key){
                        return i;
                }
                return occurrenceInArray(arr, i+1, key);
        }

}
