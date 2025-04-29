package in.questions;
import java.util.Deque;
import java.util.LinkedList;
public class StackUsingDeque {

        public static class Stack{
                Deque<Integer> deque = new LinkedList<>();

                public void push(int val){
                        deque.addLast(val);
                }

                public int pop(){
                        return deque.removeLast();
                }

                public int peek(){
                        return deque.getLast();
                }

                @Override
                public String toString(){
                        return deque.toString();
                }

        }

        public static void main(String[] args){
                Stack s = new Stack();
                s.push(3);
                s.push(2);
                s.push(1);
                System.out.println(s);
                System.out.println(s.pop());
                System.out.println(s.pop());
                System.out.println(s.pop());
        }

}
