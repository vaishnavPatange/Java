public class PrintLL{
        public static class Node{
                public int data;
                Node next;

                public Node(int data) {
                        this.data = data;
                        next = null;
                }
        }
        public static Node head;
        public static Node tail;

       public void addFirst(int data){
               Node newNode = new Node(data);
               if(head == null){
                       head = tail = newNode;
               }
               newNode.next = head;
               head = newNode;
       }
        public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head = tail = newNode;
                }
                tail.next = newNode;
                tail = newNode;
        }
       public void printLL(){
               Node temp = head;
               while (temp != null){
                       System.out.print(temp.data + " -> ");
                       temp = temp.next;
               }
               System.out.println("null");
       }

        public static void main(String[] args){
                PrintLL linkedList = new PrintLL();
                linkedList.addFirst(1);
                linkedList.addFirst(2);
                linkedList.addLast(5);
                linkedList.addLast(8);
                linkedList.addFirst(10);
                linkedList.printLL();
        }

}
