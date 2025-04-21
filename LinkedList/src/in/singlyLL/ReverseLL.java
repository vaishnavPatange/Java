package in.singlyLL;

public class ReverseLL {

        public static class Node{
                public int data;
                Node next;
                public Node(int data){
                        this.data = data;
                        this.next = null;
                }
        }

        public  Node head;
        public  Node tail;
        public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head = tail = newNode;
                        return;
                }
                tail.next = newNode;
                tail = newNode;
        }
        public void printList(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }
        public void reverseList(){
                Node prev = null;
                Node curr = tail = head;
                Node next;
                while (curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }
                head = prev;
        }

        public static void main(String[] args){
                ReverseLL ll = new ReverseLL();
                ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4); ll.addLast(5);
                ll.printList();
                ll.reverseList();
                ll.printList();

                System.out.println(" 2nd LL --------------------------");

                ReverseLL ll2 = new ReverseLL();
                ll2.addLast(10); ll2.addLast(20); ll2.addLast(30); ll2.addLast(40); ll2.addLast(50);
                ll2.printList();
                ll2.reverseList();
                ll2.printList();

        }


}
