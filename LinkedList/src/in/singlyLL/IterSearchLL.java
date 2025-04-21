package in.singlyLL;

public class IterSearchLL {
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
                        head = tail = newNode;
                        size++;
                        return;
                }
                tail.next = newNode;
                tail = newNode;
                size++;
        }

        public void printList(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public int searchKey(int key){
                Node temp = head;
                int i = 0;
                while(temp != null){
                        if(temp.data == key){
                                return i;
                        }
                        temp = temp.next;
                        i++;
                }
                return -1;
        }

        public static void main(String[] args) {
                IterSearchLL ll = new IterSearchLL();
                ll.addLast(2); ll.addLast(8); ll.addLast(10); ll.addLast(19);
                ll.printList();
                System.out.println(ll.searchKey(10));
                System.out.println(ll.searchKey(67));
        }
}
