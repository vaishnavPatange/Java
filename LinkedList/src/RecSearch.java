public class RecSearch {
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
        public void addLast(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head = tail = newNode;
                        return;
                }
                tail.next = newNode;
                tail = newNode;
        }
        public void printLL(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public int helper(Node head, int key){
                if(head == null){
                        return -1;
                }
                if(head.data == key){
                        return 0;
                }
                int idx = helper(head.next, key);
                if(idx == -1){
                        return -1;
                }
                return idx+1;
        }

        public int recSearch(int key){
                return helper(head, key);
        }

        public static void main(String[] args){
                RecSearch ll = new RecSearch();
                ll.addLast(2); ll.addLast(8); ll.addLast(87); ll.addLast(19);
                ll.printLL();
                System.out.println(ll.recSearch(87));
                System.out.println(ll.recSearch(17));
        }

}
