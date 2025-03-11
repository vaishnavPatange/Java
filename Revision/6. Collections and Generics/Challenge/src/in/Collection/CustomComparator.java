package in.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
        public static void main(String[] args) {
                List<String> list = Arrays.asList("Lion", "Fox", "Hyena", "Deer", "Bear");
                System.out.println(list);
                sortInDesc(list);
                System.out.println(list);

        }

        public static void sortInDesc(List<String> list){
                Collections.sort(list, new Comparator<String>() {
                        @Override
                        public int compare(String s1, String s2) {
                                if(s1.equals(s2)){
                                        return 0;
                                } else if (s1.charAt(0) < s2.charAt(0)) {
                                        return 1;
                                } else {
                                        return  -1;
                                }
                        }
                });
        }

}
