public class DecreasingOrder{
    
    public static void decrease(int n){
        if(n == 1){ // this is Base Case
            System.out.println(1);
            return;
        }
        
        System.out.print(n+ " ");
        decrease(n-1);
        
    }

    public static void increase(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        increase(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        decrease(11);
        increase(11);
    }
}