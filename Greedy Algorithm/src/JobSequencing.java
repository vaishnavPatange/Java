import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
        public static void main(String[] args) {
                int[][] jobInfo = { {4, 20} , {1, 10}, {1, 40}, {1, 30}};

                Arrays.sort(jobInfo, Comparator.comparingDouble(o -> o[1]));
                ArrayList<int[]> ans = new ArrayList<>();
                ans.add(jobInfo[jobInfo.length-1]);
                int deadline = jobInfo[jobInfo.length-1][0];
                for(int i= jobInfo.length-2; i >= 0; i--){
                        if(deadline < jobInfo[i][0]){
                                ans.add(jobInfo[i]);
                                deadline = jobInfo[i][0];
                        }
                }

                System.out.println("Max job that can be done = " + ans.size());
                for (int[] an : ans) {
                        System.out.print("{" + an[0] + "," + an[1] + "} ");
                }
                System.out.println();
        }
}
