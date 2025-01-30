class MaxAndMin {
        public static void main(String[] args) {
                int[] arr = ArrayUtility.arrayInput();
               int minElement =  minInArray(arr);
                int maxElement =  maxInArray(arr);
                System.out.println("Max Element in Array is : " + maxElement + "\nMin Element in Array is : " + minElement);
        }

        public static int minInArray(int[] arr){
                int minElement = Integer.MAX_VALUE;
                for(int i=0; i<arr.length; i++){
                        if(minElement > arr[i]){
                                minElement = arr[i];
                        }
                }
                return minElement;
        }

        public static int maxInArray(int[] arr){
                int maxElement = Integer.MIN_VALUE;
                for(int i=0; i<arr.length; i++){
                        if(maxElement < arr[i]){
                                maxElement = arr[i];
                        }
                }
                return maxElement;
        }


}
