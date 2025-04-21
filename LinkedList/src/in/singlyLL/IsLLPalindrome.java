package in.singlyLL;

public class IsLLPalindrome {

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

        public Node findMid(Node head){
                Node slow = head;
                Node fast = head;
                while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                }
                return slow; // slow is mid
        }


        public boolean isPalindrome(){
                if(head == null || head.next == null){
                        return true;
                }
                // step 1 find mid
                Node midNode = findMid(head);
                // step 2 reverse rightLL
                Node prev= null;
                Node curr = midNode;
                Node next;
                while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }
                Node right = prev;
                Node left = head;
                // step 3 check if data in left and right is same
                while(right != null){
                        if(right.data != left.data){
                                return false;
                        }
                        right = right.next;
                        left = left.next;
                }
                return true;
        }

        public static void main(String[] args) {
                IsLLPalindrome ll = new IsLLPalindrome();
                ll.addLast(1); ll.addLast(3);  ll.addLast(2); ll.addLast(1);
                ll.printLL();
                System.out.println(ll.isPalindrome());
        }
}
