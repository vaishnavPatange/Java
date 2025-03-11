package in.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCount {
        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(2, 5, 2, 6, 2, 6, 8, 9, 4, 5, 9, 6);
                System.out.println(Collections.frequency(list, 2));
                System.out.println(Collections.frequency(list, 10));
                System.out.println(Collections.frequency(list, 8));
        }
}
