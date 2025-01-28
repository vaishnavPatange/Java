public class Kadanes {
    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("The max sum = "+ ms);
    }
    public static void main(String args[]){
        int number[] = {-2, -4, 5, 7, 11, -5, 15};
        kadanes(number);
    }
}
