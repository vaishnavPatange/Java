public class NaturalSum {
    public static int natSum(int n){
        if(n == 1){
            return 1;
        }
        natSum(n-1);
        int sum = n + natSum(n-1);
        return sum;
    }

    public static void main(String args[]){
        System.out.println(natSum(5));
    }
}
