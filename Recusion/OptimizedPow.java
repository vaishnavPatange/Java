public class OptimizedPow {
    public static int optiPow(int x, int n){
        if(n == 1){
            return x;
        }
        int HalfPow = optiPow(x, n/2);
        int xSq = HalfPow * HalfPow;
        if(n % 2 != 0){
            xSq = x * xSq;
        }
        return xSq;
    }
    public static void main(String args[]){
        System.out.println(optiPow(2, 5));
    }
}
