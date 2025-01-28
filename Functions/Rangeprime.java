public class Rangeprime{
    public static boolean prime(int a){
        if(a == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeinRange(int n){
        for(int i = 2; i<= n; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]){
        PrimeinRange(1000);
    }
}