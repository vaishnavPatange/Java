public class TilingProb {
    public static int totalW(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // work 
        // vertically
        // int vert = totalW(n-1);
        // // hoizontally
        // int horz = totalW(n-2);

        // int tW = vert + horz;

        // OR

        return totalW(n-1) + totalW(n-2);
    }
    public static void main(String args[]){
        System.out.println(totalW(4));
    }
}
