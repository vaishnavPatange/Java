public class Main {

    public static  void firstPattern(){
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static  void secondPattern(){
        for(int i=5; i>=0; i--){
            for(int j=i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void thirdPattern(){

    }

    public static void main(String[] args) {
        firstPattern();
        secondPattern();
    }
}