package in.Collection;


public class StringConcate {
        public static void main(String[] args) {

                System.out.println(strConcat("Vaishnav", "Patange", "Hello"));
                System.out.println(strConcat("Vaishnav", "Patange"));
                System.out.println(strConcat("Vaishnav", "Patange", "Hello", "Ji"));

        }

        public static StringBuilder strConcat(String... str){
                StringBuilder strB = new StringBuilder();
                for (String s : str) {
                        strB.append(s);
                }
                return strB;
        }


}