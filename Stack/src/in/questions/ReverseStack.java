package in.questions;

import java.util.Stack;

public class ReverseStack {

        public static void pushAtBtm(Stack<Integer> s, int data){
                if(s.isEmpty()){
                        s.push(data);
                        return;
                }
                int top = s.pop();
                pushAtBtm(s, data);
                s.push(top);
        }

        public static void reverseStack(Stack<Integer> s){
                if(s.isEmpty()){
                        return;
                }
                int top = s.pop();
                reverseStack(s);
                pushAtBtm(s, top);
        }

        public static void main(String[] args) {
                Stack<Integer> s = new Stack<>();
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);
                System.out.println(s);
                reverseStack(s);
                System.out.println(s);
        }
}
