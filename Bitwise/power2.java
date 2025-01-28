public class power2 {
    public static void main(String args[]){
        int n = 16;
        if((n & (n-1)) == 0){
            System.out.println("power of two");
        } else{
            System.out.println("not power of two");
        }
    }
}
