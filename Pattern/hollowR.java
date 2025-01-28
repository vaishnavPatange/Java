public class hollowR{

    public static void Hollow_Rectangle(int R, int C){
        // for line or row
        for(int i =1; i<=R; i++){
            // for columns
            for(int n =1; n<=C; n++){
                // to print the stars
                if(i == 1 || i == R || n == 1 || n == C){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    // inverted roteted half pyramid 
    public static void inverted_roteted_Pyramid(int n){
        // for rows or lines
        for(int i=1; i<=n; i++){
            // for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Hollow_Rectangle(4,4);
        inverted_roteted_Pyramid(4);
    }
}