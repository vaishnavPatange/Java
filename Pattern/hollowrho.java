public class hollowrho{
    public static void Hollow_Rhombus(int r){
        // for line
        for(int i=1; i<=r; i++){
            // for spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // for hollow rectangle beacause we added spaces first so it will be rhombus
            for(int j=1; j<=r; j++){
                if(i == 1 || i == r || j == 1 || j == r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        Hollow_Rhombus(8);
    }
}