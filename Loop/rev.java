public class rev{
    public static void main(String args[]){
        int n = 32894;
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            n /= 10; // n = n/10
            rev = (rev*10) + lastdigit;
        }
        System.out.println(rev);
    }
}