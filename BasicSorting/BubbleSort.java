// public class BubbleSort{
//     public static void BubSort(int arr[]){
//         // IF array is already sorted
//         int swap = 0;
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i] < arr[i+1]){
//                 swap = 0;
//             } else{
//                 swap++;
//             }
//         }
//         if(swap == 0){
//             System.out.println("The array is already sorted");
//         } else{
//            for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//            }
//         }

         
        
        
//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5, 4, 1, 3, 2};
//         BubSort(arr);
//         printArr(arr);
//     }
// }



// modified bubble sort
public class BubbleSort{
    
    public static void modiBubbleSort(int arr[]){
        int length = arr.length;
        for(int i=0; i<length-1; i++){
            boolean swapped = false;
            for(int j=0; j<length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(swapped == false){
                System.out.println("Array is already sorted");
                break;
            }
        }
    }
    
    public static void printArray(int arr[]){
        int length = arr.length;
        for(int i=0; i<length-1; i++){
            System.out.print(i+" ");
        }
    }
    
    
    
    public static void main(String[] args){
        int arr[] = {1, 3, 5, 7, 9, 10, 11, 15};
        modiBubbleSort(arr);
        printArray(arr);
    }
}
