public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 12, 67};
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 67){
                System.out.println(arr[i]);
                System.out.println(true);
            }
        }
    }
}