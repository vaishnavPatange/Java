import java.util.Deque;
import java.util.LinkedList;

public class DequeUsingJCF {

        public static void main(String[] args) {
                Deque<Integer> deque = new LinkedList<>();
                deque.addFirst(2);
                deque.addFirst(1);
                deque.addLast(3);
                deque.addLast(4);

                System.out.println(deque);
                System.out.println(deque.removeFirst());
                System.out.println(deque.removeLast());
                System.out.println(deque);
                System.out.println("First el = " + deque.getFirst());
                System.out.println("Last el = " + deque.getLast());

        }

}
