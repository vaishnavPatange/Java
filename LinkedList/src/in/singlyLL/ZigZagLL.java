package in.singlyLL;

public class ZigZagLL{
        public static class Node {
                public int data;
                public Node next;
                public Node(int data){
                        this.data = data;
                        this.next = null;
                }
        }

        public  Node head;
        public  Node tail;
        public boolean isEmpty(){
                return head == null;
        }
        public void addLast(int data){
                 Node newNode = new  Node(data);
                if(head == null){
                        head = tail = newNode;
                }
                tail.next = newNode;
                tail = newNode;
        }
        public  void printLL(){
                 Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public void zigZag(){
                if(isEmpty()) {
                        System.out.println("LL is empty");
                        System.out.println("null");
                        return;
                }
                // step 1 - find the midNode
                Node slow = head;
                Node fast = head.next;
                while( fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                }
                Node midNode = slow;
                // step 2 - reverse 2nd half
                Node curr = midNode.next;
                midNode.next = null;
                Node prev = null;
                Node next;
                while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }
                // step 3 - zigzag pattern
                Node left = head;
                Node right = prev;
                Node nextL, nextR;
                while(left != null && right != null){
                        nextL = left.next;
                        left.next = right;
                        nextR = right.next;
                        right.next = nextL;

                        left = nextL;
                        right = nextR;
                }
        }

        public static void main(String[] args){
                ZigZagLL ll = new ZigZagLL();
                ll.addLast(5); ll.addLast(7); ll.addLast(1);
                ll.addLast(11); ll.addLast(9);  //ll.addLast(51);
                ll.printLL();
                ll.zigZag();
                ll.printLL();
        }

}
