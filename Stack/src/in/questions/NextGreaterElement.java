package in.questions;

import java.util.Stack;

// VV imp ques
public class NextGreaterElement {
        public static void main(String[] args) {
                int[] arr = {10, 8, 7, 1, 5, 9};
                Stack<Integer> s = new Stack<>();
                int[] nextGrt = new int[arr.length];

                for (int i = arr.length - 1 ; i >= 0; i--) {
                        // step 1 isEmpty() && arr[s.peek()] <= arr[i] then pop
                        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                                s.pop();
                        }

                        // step 2 if s is Empty then -1 or top -> nextGtr
                        if(s.isEmpty()){
                                nextGrt[i] = -1;
                        } else{
                                nextGrt[i] = arr[s.peek()];
                        }

                        // step 3 add index of current element in stack
                        s.push(i);
                }

                for (int i : nextGrt) {
                        System.out.print(i + "  ");
                }

        }
}
