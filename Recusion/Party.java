public class Party {
    public static int choices(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // kaam
        // int singleChoices = choices(n-1);
        // int pairChoices = choices(n-2) * (n-1);

        // int totalChoices = singleChoices + pairChoices;
        // return totalChoices;

        // OR

        return choices(n-1) + (n-1) * choices(n-2);
    }
    public static void main(String args[]){
        System.out.println(choices(4));
    }
}
