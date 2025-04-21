import java.util.Stack;

public class StackUsingJCF {

        public static void main(String[] args) {
                Stack<Integer> stack = new Stack<>();
                stack.push(8);
                stack.push(7);
                stack.push(6);
                stack.push(5);
                stack.push(4);
                System.out.println(stack);
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack);
                System.out.println(stack.peek());
        }

}
