import java.util.Scanner;

class Concatenate {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("How many word you want to concatenate : ");
                int num = sc.nextInt();
                String[] arr = new String[num];
                System.out.println("Enter your words : ");
                for(int i=0; i<num; i++){
                        String str = sc.next();
                        arr[i] = str;
                }
                StringBuilder string = new StringBuilder();
                for( String i : arr){
                        string.append(i).append("-");
                }

                System.out.println("The concatenated word is : " + string);

        }
}
