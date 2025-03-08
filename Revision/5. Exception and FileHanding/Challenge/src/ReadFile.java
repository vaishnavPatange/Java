import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello, Welcome to File Reader");
                System.out.print("Please, Enter your File name (Should contain full path) : ");
                String fileName = sc.next();

                try (FileReader reader = new FileReader(fileName)){
                        int character;
                        do {
                                character = reader.read();
                                if(character != -1) System.out.print((char)character);
                        } while(character != -1);

                } catch (FileNotFoundException ex) {
                        System.out.printf("%s, not found", fileName);
                } catch (IOException e){
                        System.out.println(e.getMessage());
                }

        }
}
