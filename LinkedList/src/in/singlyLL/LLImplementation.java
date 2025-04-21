package in.singlyLL;

public class LLImplementation {
        public static class Node{
                public int data;
                Node next;

                public Node(int data){
                        this.data = data;
                        this.next = null;
                }
        }
        public static Node head;
        public static Node tail;

        public static void main(String[] args){
                LLImplementation ll = new LLImplementation();
                ll.head = new Node(1);
                ll.head.next = new Node(2);
        }
}
