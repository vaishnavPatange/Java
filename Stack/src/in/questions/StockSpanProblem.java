package in.questions;

import java.util.Stack;

public class StockSpanProblem {

        public static void stackSpan(int[] stocks, int[] span){
                Stack<Integer> s = new Stack<>();
                span[0] = 1;
                s.push(0);
                for (int i = 1; i < stocks.length; i++) {
                        while( !s.isEmpty() && stocks[s.peek()] <= stocks[i]){
                                s.pop();
                        }
                        if(s.isEmpty()){
                                span[i] = i + 1;
                        } else{
                                span[i] = i - s.peek();
                        }
                        s.push(i);
                }
        }

        public static void main(String[] args) {
                int[] stocks = {100, 80, 60, 70, 85, 100};
                int[] span = new int[stocks.length];

                stackSpan(stocks, span);

                for (int i : span) {
                        System.out.print(i + " ");
                }

        }
}
