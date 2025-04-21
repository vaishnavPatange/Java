package in.singlyLL;

public class AddInMiddleLL {
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

       public void add(int idx, int data){
               if(head == null){
                       addLast(data);
                       return;
               }
               Node newNode = new Node(data);
               int i= 0; Node temp = head;
               while(i < idx-1){
                       temp = temp.next;
                       i++;
               }
               newNode.next = temp.next;
               temp.next = newNode;
               size++;
       }

       public static void main(String[] args){
               AddInMiddleLL linkedList = new AddInMiddleLL();
               linkedList.addLast(1);
               linkedList.addLast(2);
               linkedList.addLast(4);
               linkedList.addLast(7);
               linkedList.add(2, 9);
               linkedList.printList();
               System.out.println("Size of list is " + size);
       }

}
