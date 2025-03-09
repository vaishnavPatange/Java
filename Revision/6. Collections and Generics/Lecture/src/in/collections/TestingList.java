package in.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
        public static void main(String[] args) {
                List<String> strList = new ArrayList<>();

                strList.add("Vaishnav ");
                strList.add("Sunilrao ");
                strList.add("Patange ");

                if(strList.contains("Patange ")){
                        System.out.println(strList.indexOf("Patange ") + 1);
                }

                strList.add(1, "Sunil");

                for (String str : strList) {
                        System.out.print(str);
                }

                strList.remove(1);
                System.out.println(strList);



        }
}
