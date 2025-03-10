package in.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
        public static void main(String[] args) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(2); queue.add(3); queue.add(4); queue.add(5); queue.add(6);
                Utility.print(queue);

                System.out.println("This is peek : " + queue.peek());
                System.out.println("This is element : " + queue.element());

                System.out.println("This is remove : " + queue.remove());
                System.out.println("This is poll : " + queue.poll());

                Utility.print(queue);

                System.out.println("using offer");
                queue.offer(2);
                Utility.print(queue);
        }
}
