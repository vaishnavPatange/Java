public class diamond{
    public static void Diamond_pattern(int r){
        // 1st half of daimond
        // for line
        for(int i=1; i<=r; i++){
            // spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i)-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // 2nd half of diamond
        for(int i=r; i>=1; i--){
            // spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i)-1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Diamond_pattern(8);
    }
}