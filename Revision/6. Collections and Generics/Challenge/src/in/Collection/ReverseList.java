package in.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(1, 4, 6, 8, 9, 10, 14, 15);
                System.out.println("before reverse " + list);
                reverseList(list);
                System.out.println("after reverse " + list);
        }

        public static void reverseList(List<Integer> list){
//                Collections.reverse(list);
                int a = 0; int b = list.size()-1;
                while (a <= b){
                        int temp = list.get(a);
                        list.set(a, list.get(b));
                        list.set(b, temp);
                        a++; b--;
                }


        }

}
