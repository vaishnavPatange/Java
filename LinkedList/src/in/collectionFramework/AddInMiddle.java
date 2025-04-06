package in.collectionFramework;

import java.util.LinkedList;

public class AddInMiddle{

        public static void printLinkedList(LinkedList<Integer> list){
                for (Integer i : list) {
                        System.out.print(i + " -> ");
                }
                System.out.println("null");
        }

        public static void main(String[] args) {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(1);
                list.add(5);
                list.add(29);
                list.add(2, 9);
                printLinkedList(list);
        }
}