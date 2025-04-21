package in.doublyLL;

public class ReverseDLL {

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

        public void printDLL(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " <-> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public void reverseDLL(){
                Node curr = head;
                Node prev = null;
                Node next;
                while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        curr.prev = next;
                        prev = curr;
                        curr = next;
                }
                head = prev;
        }

        public static void main(String[] args) {
                ReverseDLL dll = new ReverseDLL();
                dll.addFirst(3);
                dll.addFirst(2);
                dll.addFirst(1);
                dll.printDLL();
                dll.reverseDLL();
                dll.printDLL();


        }


}
