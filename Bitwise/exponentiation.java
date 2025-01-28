public class exponentiation {
    public static int FastExponentiation(int n, int i){
        int ans = 1;
        while(i > 0){
            if((i & 1) != 0){
                ans *= n;
            }
            n = n * n;
            i = i>>1;
            
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(FastExponentiation(5, 3));
    }
    
}
