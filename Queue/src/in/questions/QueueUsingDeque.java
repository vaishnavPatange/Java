package in.questions;
import java.util.Deque;
import java.util.LinkedList;
public class QueueUsingDeque {
        public static class Queue{
                Deque<Integer> deque = new LinkedList<>();

                public void add(int val){
                        deque.addLast(val);
                }
                public int remove(){
                        return deque.removeFirst();
                }
                public int peek(){
                        return deque.getFirst();
                }
                @Override
                public String toString(){
                        return deque.toString();
                }
        }

        public static void main(String[] args) {
                Queue q = new Queue();
                q.add(5);
                q.add(4);
                q.add(3);
                System.out.println(q);
                System.out.println(q.remove());
                System.out.println(q);
                System.out.println(q.peek());
        }
}
