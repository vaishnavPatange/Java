package in.collectionFramework;
import java.util.LinkedList;
import java.util.Collections;
public class ReverseLinkedList {

        public static void printList(LinkedList<Integer> list){
                for (Integer i : list) {
                        System.out.print(i + " -> ");
                }
                System.out.println("null");
        }

        public static void main(String[] args) {
                LinkedList<Integer> list = new LinkedList<>();
                for (int i = 0; i < 10; i++) {
                        list.add(i+1);
                }
                printList(list);
                Collections.reverse(list);
                printList(list);

        }
}
