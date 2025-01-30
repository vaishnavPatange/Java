class SortedArray {
        public static void main(String[] args) {
                int[] arr = ArrayUtility.arrayInput();
                if(isIncreasing(arr) || isDecreasing(arr)){
                        System.out.println("Array is Sorted");
                } else{
                        System.out.println("Array is not Sorted");
                }
        }

        public static boolean isDecreasing(int[] arr) {
                for(int i=0; i< arr.length - 1; i++){
                        if(arr[i] < arr[i+1]){
                                return  false;
                        }
                }
                return true;
        }
        public static boolean isIncreasing(int[] arr) {
                for(int i=0; i< arr.length - 1; i++){
                        if(arr[i] > arr[i+1]){
                                return  false;
                        }
                }
                return true;
        }


}
