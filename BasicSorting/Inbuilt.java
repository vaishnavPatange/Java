import java.util.*;
// java.util.* includes java.util.Arrays & java.util.collections
public class Inbuilt {
    public static void main(String args[]){
        Integer arr[] = {5, 4, 3, 1, 2};
        
        // simply call the inbuilt array sorting function
        Arrays.sort(arr);
        // to sort some part
        Arrays.sort(arr, 0, 4);

        // to print array in reverse order(Descending order)
        Arrays.sort(arr,Collections.reverseOrder());
        // to sort some part in revesre order
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
