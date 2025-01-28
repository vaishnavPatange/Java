public class CountingSort {
    public static void CountSort(int arr[]){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // sorting 
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 5, 8, 7, 1, 9, 6, 5};
        CountSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
