import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {
        public static void main(String[] args) {
                // similar to Activity Selection
                int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

                Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
                ArrayList<int[]> chain = new ArrayList<>();

                int chainLength = 1;
                chain.add(pairs[0]);
                int chainEnd = pairs[0][1];
                for (int i = 1; i < pairs.length; i++) {
                        if(pairs[i][0] > chainEnd){
                                chainLength++;
                                chain.add(pairs[i]);
                                chainEnd = pairs[i][1];
                        }
                }
                System.out.println("Max length of chain pairs = " + chainLength);
                for (int[] ints : chain) {
                        System.out.print("{" + ints[0] + ", " + ints[1] + "} ");
                }
        }
}
