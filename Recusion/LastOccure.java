public class LastOccure {
    public static int lastOccure(int arr[], int key, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return lastOccure(arr, key, i-1);
    }
    public static void main(String args[]){
        int arr[] = {1, 34, 5, 6, 38, 38, 38, 45, 38};
        System.out.println(lastOccure(arr, 38, arr.length-1));
        System.out.println(Math.pow(8,5));

    }
}
