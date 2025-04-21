package in.questions;
import java.util.Stack;
public class MaxAreaInHistogram {
        public static void main(String[] args) {
                int[] arr = {2,4};
                maxAreaInHist(arr);
        }


        public static void maxAreaInHist(int[] arr){
                int maxArea = 0;
                int[] nextSmR = new int[arr.length]; // next smallest right
                int[] nextSmL = new int[arr.length]; // next smallest left

                // step 1 - calculate next smallest right
                Stack<Integer> s = new Stack<>();
                for(int i=arr.length -1 ; i >= 0 ; i--){
                        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                                s.pop();
                        }
                        if(s.isEmpty()){
                                nextSmR[i] = arr.length;
                        } else{
                                nextSmR[i] = s.peek();
                        }
                        s.push(i);
                }
                // step 2 - calculate next smallest left
                s = new Stack<>(); // emptying stack
                for(int i= 0; i < arr.length; i++){
                        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                                s.pop();
                        }
                        if(s.isEmpty()){
                                nextSmL[i] = -1;
                        } else{
                                nextSmL[i] = s.peek();
                        }
                        s.push(i);
                }
                // step 3 calculate the area
                for(int i=0; i < arr.length; i++){
                        int height = arr[i];
                        int width = nextSmR[i] - nextSmL[i] - 1;
                        int currArea = height * width;
                        maxArea = Math.max(currArea, maxArea);
                }
                System.out.printf("Max area from histogram is %d", maxArea);
        }
}
