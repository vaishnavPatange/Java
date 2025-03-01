import java.util.ArrayList;

public class MaxNumber {
        public static void main(String[] args) {
               ArrayList<Integer> list =  ArrayListUtility.initArrayList();

               int max = Integer.MIN_VALUE;
               for(int i=0; i<list.size(); i++){
//                       if(list.get(i) > max) max = list.get(i);
                       max = Math.max(max, list.get(i));
               }
                System.out.println("Max in Arraylist is : " + max);
        }
}
