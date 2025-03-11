package in.Collection;

import java.util.Arrays;
import java.util.List;

public class SwapElements {
        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(2, 4, 7, 3, 8, 2, 28);
                System.out.println("before swap: "+list);
                int temp = list.get(5);
                list.set(5, list.get(4));
                list.set(4, temp);
                System.out.println( "after swap: "+list);

        }
}
