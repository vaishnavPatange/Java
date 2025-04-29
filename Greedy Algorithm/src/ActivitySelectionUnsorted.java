import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsorted {
        public static void main(String[] args) {
                int[] start = {1, 3, 0, 5, 8, 5};
                int[] end = {2, 4, 6, 9, 9, 7};

                int[][] activities = new int[start.length][3];

                for(int i=0; i<start.length; i++){
                        activities[i][0] = i;
                        activities[i][1] = start[i];
                        activities[i][2] = end[i];
                }

                // To sort 2D array we use comparator in this using Lambda function
                Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sorting based on end time so 2;

                ArrayList<Integer> ans = new ArrayList<>();

                ans.add(activities[0][0]);
                int maxSel = 1;
                int prevEnd = activities[0][2];
                for (int i = 1; i < activities.length; i++) {
                        if(activities[i][1] >= prevEnd){
                                maxSel++;
                                ans.add(activities[i][0]);
                                prevEnd = activities[i][2];
                        }
                }
                System.out.println("Max selection = " + maxSel);

                for (int i = 0; i < ans.size(); i++) {
                        System.out.print("A"+ans.get(i)+ " ");
                }
        }
}
