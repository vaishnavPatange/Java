import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencing2 {
        // using class and sorting an object
        public static class Job{
                int id;
                int deadline;
                int profit;

                public Job(int id, int deadline, int profit) {
                        this.id = id;
                        this.deadline = deadline;
                        this.profit = profit;
                }
        }

        public static void main(String[] args) {
                int[][] jobInfo = { {4, 20} , {1, 10}, {1, 40}, {1, 30}};
                ArrayList<Job> jobs = new ArrayList<>();
                for (int i = 0; i < jobInfo.length; i++) {
                        jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
                }
                // to sort in descending order based on profit
                Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
                // to sort in ascending order based on profit
                // Collections.sort(jobs, (obj1, obj2) -> obj1.profit-obj2.profit);

                ArrayList<int[]> ans = new ArrayList<>();
                int time = 0;
                for(int i=0; i<jobs.size(); i++){
                        Job currJob = jobs.get(i);
                        if(currJob.deadline > time){
                                int[] currAns = {currJob.deadline, currJob.profit};
                                ans.add(currAns);
                                time = currJob.deadline;
                        }
                }
                System.out.println("Max job can be done are = " + ans.size());
                for (int[] an : ans) {
                        System.out.print("{" + an[0] + "," + an[1] + "} ");
                }
                System.out.println();
        }
}
