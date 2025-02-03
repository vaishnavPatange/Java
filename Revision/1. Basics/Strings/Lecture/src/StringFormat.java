public class StringFormat {
        public static void main(String[] args) {
                int marks = 35;
                int number = -29384729;
                String name = "Vaishnav";
                System.out.println("Hello, " + name + " , your marks are : " + marks);

                System.out.printf("Hello, %-15S , your marks are : %d", name, marks);

                System.out.printf("Hello, %-15S , your number is : %,+12d", name, number);



        }
}