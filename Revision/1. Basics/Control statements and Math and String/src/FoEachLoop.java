import java.util.Scanner;

class FoEachLoop {
        public static void main(String[] args) {
                String[] arr = new String[]{
                        "Shyam", "Ram", "Harish", "Ramesh", "Suresh", "Rajnikant"
                };

                int[] numbersArray = new int[]{
                        2, 6, 2, 75, 92, 2, 33, 3, 45
                } ;
                int count = 0;
                for(int i : numbersArray){
                        if( i == 2){
                                count++;
                        }
                }
                System.out.println(count);
                for(String name : arr){
                        System.out.println(name);
                }

        }
}
