import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
        public static void main(String[] args) {
                int n = 2, m = 2;
                Integer[] verCost =  {2}; //{2, 1, 3, 1, 4}; // n - 1;
                Integer[] horCost =  {3}; //{4, 1, 2}; // m - 1;

                Arrays.sort(verCost, Collections.reverseOrder());
                Arrays.sort(horCost, Collections.reverseOrder());

                int v=0; int h=0;
                int vp=1, hp=1;
                int cost = 0;
                while(v < verCost.length && h < horCost.length){
                        if(horCost[h] <= verCost[v]){
                                cost += verCost[v] * hp;
                                vp++;
                                v++;
                        } else{
                                cost += horCost[h] * vp;
                                hp++;
                                h++;
                        }
                }
                while(v < verCost.length){
                        cost += verCost[v] * hp;
                        vp++;
                        v++;
                }
                while(h < horCost.length){
                        cost += horCost[h] * vp;
                        hp++;
                        h++;
                }

                System.out.println("Min cost to cut chocolate into square = " + cost);
        }
}
