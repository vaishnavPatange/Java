package in.doublyLL;

public class DoubleLL {

        public static class Node{
                int data;
                Node next;
                Node prev;
                public Node(int data){
                        this.data = data;
                        this.next  = null;
                        this.prev  = null;
                }
        }

        public Node head;
        public Node tail;
        public int size = 0;

        public boolean isEmpty(){
                return head == null;
        }

        public void addFirst(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                        head = tail = newNode;
                        size++;
                        return;
                }
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                size++;
        }

        public void addLast(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                        head = tail = newNode;
                        size++;
                }
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                size++;
        }

        public void printDLL(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " <-> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public int removeFirst(){
                if(isEmpty()){
                        System.out.println("Doubly LL is empty");
                        return Integer.MIN_VALUE;
                }
                if(size == 1){
                        int val = head.data;
                        head = null;
                        size--;
                        return val;
                }
                int val = head.data;
                head = head.next;
                head.prev = null;
                size--;
                return val;
        }

        public int removeLast(){
                if(isEmpty()){
                        System.out.println("DLL is empty");
                        return Integer.MIN_VALUE;
                }
                if(size == 1){
                        int val = head.data;
                        head = tail = null;
                        size--;
                        return val;
                }
                int val = tail.data;
                tail = tail.prev;
                tail.next = null;
                size--;
                return val;
        }

        public static void main(String[] args) {
                DoubleLL dll = new DoubleLL();
                dll.addFirst(3);
                dll.addFirst(2);
                dll.addFirst(1);
                dll.addFirst(3456);
                System.out.println(dll.size); dll.printDLL();

                dll.removeFirst(); System.out.println(dll.size); dll.printDLL();

                dll.removeFirst(); System.out.println(dll.size); dll.printDLL();

                dll.addLast(4);
                dll.addLast(5);
                dll.addLast(6);
                System.out.println(dll.size); dll.printDLL();

                dll.removeLast(); System.out.println(dll.size); dll.printDLL();

                dll.removeLast(); System.out.println(dll.size); dll.printDLL();

        }


}
