import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
        public static void main(String[] args) {
                int[] val = {60, 100, 120};
                int[] weight = {10, 20, 30};
                int W = 60;

                double[][] ratio = new double[val.length][2];
                for(int i=0; i<ratio.length; i++){
                        ratio[i][0] = i;
                        ratio[i][1] = (double) val[i] / weight[i];
                }

                // if not in sorted order
                Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // sort in asc order

                int capacity = W;
                int finalVal = 0;
                for(int i= ratio.length - 1; i>=0; i--){
                        int idx = (int)ratio[i][0];
                        if(capacity >= weight[idx]){
                                finalVal += val[idx];
                                capacity -= weight[idx];
                        } else{
                                finalVal += (int)ratio[i][1] * capacity;
                                capacity = 0;
                                break;
                        }
                }
                System.out.println("Max capacity is " + finalVal);
        }
}
