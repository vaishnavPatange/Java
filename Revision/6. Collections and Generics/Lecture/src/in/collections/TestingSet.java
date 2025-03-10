package in.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
        public static void main(String[] args) {
                Set<String> names = new HashSet<>();
                System.out.println(names.add("Vaishnav"));
                System.out.println(names.add("Naresh"));
                System.out.println(names.add("Samarth"));
                System.out.println((names.add("samarth")));

                Utility.print(names);

                System.out.println(names.contains("samarth"));
                System.out.println(names.remove("samarth"));

                Utility.print(names);

                System.out.println(names.isEmpty());
                System.out.printf("size of name is %d",names.size());

        }
}
