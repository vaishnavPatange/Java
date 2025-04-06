public class AddInLL {
        public static class Node{
                public int data;
                Node next;
                public Node(int data){
                        this.data = data;
                        this.next = null;
                }

                @Override
                public String toString() {
                        String str = "Data is " + data;
                        return str;
                }
        }
        public static Node head;
        public static Node tail;

        public void addFirst(int data){
                // create node
                Node newNode = new Node(1);
                if(head == null){
                        head = tail = newNode;
                        return;
                }
                // next of newNode = head
                newNode.next = head;
                // head = newNode
                head = newNode;
        }

        public void addLast(int data){
              // create Node
                Node newNode = new Node(5);
                if(head == null){
                        head = tail = newNode;
                        return;
                }
                // next of newNode = tail
                newNode.next = tail;
                // newNode = tail
                tail = newNode;
        }

        public static void main(String[] args){
                AddInLL ll = new AddInLL();
                ll.addFirst(4);
                ll.addFirst(3);
                ll.addLast(10);
                ll.addLast(6);
                System.out.println(ll);
        }

}
