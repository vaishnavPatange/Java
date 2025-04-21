package in.singlyLL;

public class LInkedLIstRevision {

        public static class Node{
                public int data;
                Node next;
                public Node(int data){
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

        public void printLL(){
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }
                System.out.println("null");
        }

        public void addFirst(int data){
                Node newNode = new Node(data);
                if(head == null){
                        head = tail = newNode;
                        return;
                }
                newNode.next = head;
                head = newNode;
        }

        public void addInMiddle(int data, int idx){
                if(head == null){
                        System.out.println("List is empty");
                        return;
                }
                Node newNode = new Node(data);
                int i = 1; Node temp = head;
                while(i < idx -1 ){
                        temp = temp.next;
                        i++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
        }

        public void removeFirst(){
                if(head == null){
                        System.out.println("LinkedList is empty");
                        return;
                }
                head = head.next;
        }

        public void removeLast(){
                if(head == null){
                        System.out.println("LL is empty");
                        return;
                }
                Node temp = head;
                int size = 0;
                while(temp != null){
                        temp = temp.next;
                        size++;
                }
                Node prev = head; int i = 0;
                while(i < size - 2){
                        prev = prev.next;
                        i++;
                }
                prev.next = null;
        }

        public void removeMiddle(int idx){
                if(head == null){
                        System.out.println("List is empty");
                        return;
                }
                int i = 1; Node temp = head;
                while(i < idx - 2){
                        temp = temp.next;
                        i++;
                }
                temp.next = temp.next.next;
        }

        public void reverseLL(){
                Node prev = null;
                Node curr = tail = head;
                Node next;
                while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }
                head = prev;
        }

        public int searchLL(int key){
                if(head == null){
                        System.out.println("LL is empty");
                        return -1;
                }
                Node temp = head;
                int idx = 1;
                while(temp != null){
                        if(temp.data == key){
                                return idx;
                        }
                        temp = temp.next;
                        idx++;
                }
                return -1;
        }

        public int helper(Node head, int key){
                if(head == null){
                        return -1;
                }
                if(head.data == key){
                        return 1;
                }
                int idx = helper(head.next, key);
                return idx + 1;
        }

        public int recSearch(int key){
                return helper(head, key);
        }


        public static void main(String[] args){
                LInkedLIstRevision ll = new LInkedLIstRevision();
//                System.out.println("Add Last");
                ll.addLast(10); ll.addLast(17); ll.addLast(9); ll.printLL();
//                System.out.println("Add first");
                ll.addFirst(12); ll.addFirst(11); ll.printLL();
//                System.out.println("Add middle");
                ll.addInMiddle(13, 3); ll.printLL();
//                System.out.println("remove first");
//                ll.removeFirst(); ll.printLL();
//                System.out.println("remove Last");
//                ll.removeLast(); ll.printLL();
//                System.out.println("remove middle");
//                ll.removeMiddle(2); ll.printLL();
//                System.out.println("reverse LL");
//                ll.reverseLL(); ll.printLL();

                System.out.println(ll.searchLL(10));
                System.out.println(ll.recSearch(10));

        }


}
