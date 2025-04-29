import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
        public static void main(String[] args) {
                Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

                Arrays.sort(coins, Comparator.reverseOrder());

                int coinsCount = 0;
                ArrayList<Integer> ans = new ArrayList<>();
                int amount = 590;

                for(int i=0; i<coins.length; i++){
                        if(coins[i] <= amount){
                                while(coins[i] <= amount){
                                        coinsCount++;
                                        amount -= coins[i];
                                        ans.add(coins[i]);
                                }
                        }
                }
                System.out.println(coinsCount);
                System.out.println("Notes : " + ans);
        }
}
