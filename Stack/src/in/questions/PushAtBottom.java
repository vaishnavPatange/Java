package in.questions;
import java.util.Stack;

public class PushAtBottom {

        public static void pushAtBtm(Stack<Integer> s, int data){
                if(s.isEmpty()){
                        s.push(data);
                        return;
                }
                int top = s.pop();
                pushAtBtm(s, data);
                s.push(top);
        }

        public static void main(String[] args) {
                Stack<Integer> stack = new Stack<>();
                stack.push(1);
                stack.push(2);
                stack.push(3);
                System.out.println(stack);
                pushAtBtm(stack, 4);
                System.out.println(stack);
                while(!stack.isEmpty()){
                        System.out.println(stack.pop());
                }
        }

}
