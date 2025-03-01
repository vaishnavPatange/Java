import java.util.ArrayList;

public class SwapIndexValues {
        public static void main(String[] args) {
                ArrayList<Integer> list =  ArrayListUtility.initArrayList();
                int idx1 = 2;
                int idx2 = 4;
                System.out.println(list);
                int temp = list.get(idx1);
                list.set(idx1, list.get(idx2));
                list.set(idx2, temp);
                System.out.println(list);
        }
}
