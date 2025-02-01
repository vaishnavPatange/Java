public class Management {
        public static void main(String[] args) {
                Book java = new Book("Basics of Java", "Games Gosling", 1234469);
                Book.totalBooks = 10;
                Course javaDsa = new Course("Java DSA");
                Course.setMaxCapacity(120);

                System.out.println("----------This is Books Class ------------");
                System.out.println("The Book you requested for is : " + java.title +
                        "\nAuthor: " + java.author);
                for(int i=0; i<4; i++){
                        java.borrowBook();
                }
                Book.getTotalBooks();
                System.out.println("----------This is Course Class ------------");
                System.out.println("The Course you have enrolled for is : " + javaDsa.courseName);
                for(int i=0; i<20; i++){
                        javaDsa.enrollStudent();
                }
                System.out.println("No. Students enrolled : " + javaDsa.enrolledStudents);

        }
}
