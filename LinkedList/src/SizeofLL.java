public class SizeofLL {
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
        public static int size;

        public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head  = tail = newNode;
                        size++;
                        return;
                }
                tail.next = newNode;
                tail = newNode;
                size++;
        }

        public static void main(String[] args){
                SizeofLL linkedList = new SizeofLL();
                linkedList.addLast(1);
                linkedList.addLast(2);
                linkedList.addLast(3);
                System.out.println("Size of LinkedList = " + size);
        }

}
