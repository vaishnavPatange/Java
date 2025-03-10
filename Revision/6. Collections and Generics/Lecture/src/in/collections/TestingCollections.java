package in.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
        public static void main(String[] args) {
                List<Integer> list = new ArrayList<>();

                for (int i = 1; i < 10; i++) {
                        if(i % 2 == 0){
                                list.add(i*2);
                        } else {
                                list.add(i*3);
                        }

                }
                Utility.print(list);

                Collections.sort(list);
                Utility.print(list);
                System.out.println("Max Element in list : "+Collections.max(list));

                System.out.println(Collections.binarySearch(list, 16));

        }
}
