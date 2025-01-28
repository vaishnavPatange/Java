public class FirstOccur {
    public static int occur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return occur(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1, 3, 5,2, 57, 32, 73, 77, 33, 6};
        System.out.println(occur(arr, 32, 0));
    }
}
