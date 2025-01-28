public class Power {
    public static int pow(int x, int n){
        if(n == 1){
            return x;
        }
        int XpN = x * pow(x,n-1);
        return XpN;
    }
    public static void main(String args[]){
        System.out.println(pow(2, 4));
    }
}
