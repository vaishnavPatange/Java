import java.util.ArrayList;

public class ActivitySelectionSorted {
        public static void main(String[] args) {
                int[] start = {1, 3, 0, 5, 8, 5};
                int[] end = {2, 4, 6, 7, 9, 9};

                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(0);
                int maxSel = 1; // as 0th added in ans;
                int prevEnd = end[0];
                for(int i=1; i < end.length; i++ ){
                        if(start[i] >= prevEnd){
                                maxSel++;
                                ans.add(i);
                                prevEnd = end[i];
                        }
                }
                System.out.println("Max selected are : " + maxSel);
                for (int i = 0; i < ans.size(); i++) {
                        System.out.print("A"+ans.get(i) + " ");
                }
                System.out.println();
        }
}