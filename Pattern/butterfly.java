public class butterfly{
    public static void Butterfly(int R){
        // 1 half of butterfly
        // for line
        for(int i=1; i<=R; i++){
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // for spaces
            for(int j=1; j<=2*(R-i); j++){
                System.out.print("  ");
            }
            // for stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half of butterfly
        // for line
         for(int i=R; i>=1; i--){
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // for spaces
            for(int j=1; j<=2*(R-i); j++){
                System.out.print("  ");
            }
            // for stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        Butterfly(7);
    }
}