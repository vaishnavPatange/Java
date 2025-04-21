package in.singlyLL;

public class RemoveLL {
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

        public int removeFirst(){
                if(size == 0){
                        return Integer.MIN_VALUE;
                } else if (size == 1) {
                        int val = head.data;
                        head = tail = null;
                        size = 0;
                        return val;
                }
                int val = head.data;
                head = head.next;
                size--;
                return val;
        }

        public int removeLast(){
                if(size == 0){
                        return Integer.MIN_VALUE;
                } else if (size == 1) {
                        int val = head.data;
                        head = tail = null;
                        return val;
                }
                Node prev = head;
                for (int i = 0; i < size - 2; i++) {
                        prev = prev.next;
                }
                int val  = tail.data;
                prev.next = null;
                tail = prev;
                size--;
                return val;
        }

        public static void main(String[] args){
                RemoveLL linkedList = new RemoveLL();
                linkedList.addLast(1);
                linkedList.addLast(2);
                linkedList.addLast(3);
                linkedList.addLast(4);
                linkedList.addLast(5);
                System.out.println("Before");
                linkedList.printList();
                System.out.println("After first delete");
                System.out.println(linkedList.removeFirst());
                linkedList.printList();
                System.out.println("After last delete");
                System.out.println(linkedList.removeLast());
                linkedList.printList();
        }
}
