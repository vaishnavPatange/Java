package in.singlyLL;

public class RemoveNFromEnd {

        public static class Node{
                public int data;
                Node next;

                public Node(int data) {
                        this.data = data;
                        this.next = null;
                }
        }

        public Node head;
        public Node tail;

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

        public void removeNthFromEnd(int idx){
                int size = 0;
                Node temp = head;
                while(temp != null){
                        size++;
                        temp = temp.next;
                }

                if(idx == size && head != null){
                        head = head.next;
                        return;
                }

               Node prev = head; int i=1;
                while( i < size - idx){
                        prev = prev.next;
                        i++;
                }
                prev.next = prev.next.next;
        }


        public static void main(String[] args){
                RemoveNFromEnd ll = new RemoveNFromEnd();
                ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4); ll.addLast(5);
                ll.printList();
                ll.removeNthFromEnd(3);
                ll.printList();
        }

}
