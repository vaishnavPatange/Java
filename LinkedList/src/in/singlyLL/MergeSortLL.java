package in.singlyLL;

public class MergeSortLL {
        public static class Node{
                int data;
                Node next;
                Node(int data){
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

        public  Node midNode(Node head){
                Node slow = head;
                Node fast = head.next;
                while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                }
                return slow;
        }

        public  Node mergeSort(Node head){
                if(head == null || head.next == null){
                        return head;
                }
                // step 1 - get the midNode
                Node midNode = midNode(head);
                // step 2 - divide LL and call mergeSort for left and right part
                Node rightNode = midNode.next;
                midNode.next = null;
                Node leftHead = mergeSort(head);
                Node rightHead =  mergeSort(rightNode);
                return mergeLL(leftHead, rightHead);
        }
        public Node mergeLL(Node head1, Node head2){
                Node newLL = new Node(-1);
                Node temp = newLL;
                while(head1 != null && head2 != null){
                        if(head1.data <= head2.data){
                                temp.next = head1;
                                head1 = head1.next;
                                temp = temp.next;
                        } else{
                                temp.next = head2;
                                head2 = head2.next;
                                temp = temp.next;
                        }
                }
                while(head1 != null){
                        temp.next = head1;
                        head1 = head1.next;
                        temp = temp.next;
                }
                while(head2 != null){
                        temp.next = head2;
                        head2 = head2.next;
                        temp = temp.next;
                }
                return newLL.next;
        }

        public static void main(String[] args){
                MergeSortLL ll = new MergeSortLL();
                ll.addLast(5); ll.addLast(7); ll.addLast(1);
                ll.addLast(11); ll.addLast(9);  ll.addLast(51);
                ll.printLL();
               ll.head =  ll.mergeSort(ll.head);
                ll.printLL();
        }
}
