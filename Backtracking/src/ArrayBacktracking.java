public class ArrayBacktracking {
        public static void main(String[] args) {
                int[] arr = new int[5];
                addElements(arr, 0, 1);
                System.out.println();
                Utility.printArray(arr);
        }
        public static void addElements(int[] arr, int i, int value){
                if(i == arr.length){
                        Utility.printArray(arr);
                        return;
                }
                arr[i] = value;
                addElements(arr, i+1, value+1);
                arr[i] -= 2;  // backtracking step
        }
}
