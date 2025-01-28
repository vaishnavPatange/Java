// print reverse of num
public class reverse{
    public static void main(String args[]){
        // Using while loop
        /*int n = 12394;
        while(n > 0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10; // n /= 10
        }*/

        // Using for loop

        
        for (int n = 749379 ; n > 0 ; n/= 10){
            int lastdigit = n%10;
            System.out.print(lastdigit);
        }
    }
}