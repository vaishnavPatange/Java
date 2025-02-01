public class Book {

        static int totalBooks;
        String title;
        String author;
        int isbn;

        Book(String title, String author, int isbn){
                this.title = title;
                this.author = author;
                this.isbn = isbn;
        }

        public static void getTotalBooks(){
                System.out.println( "The total number of Books left are : " + totalBooks);
        }

        public void borrowBook(){
                totalBooks--;
        }

        public void returnBook(){
                totalBooks++;
        }



}
