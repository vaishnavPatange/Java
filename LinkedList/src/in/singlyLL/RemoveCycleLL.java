package in.singlyLL;

public class RemoveCycleLL {

        public static class Node{
                int data;
                Node next;
                Node(int data){
                        this.data = data;
                        this.next = null;
                }
        }

       public static Node head;

        public static boolean isCycle(){
                Node slow = head;
                Node fast = head;
                while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if(slow == fast){
                                return true;
                        }
                }
                return false;
        }

        public static void removeCycle(){
                Node slow = head;
                Node fast = head;
                boolean cycle = false;
                while(fast != null && fast.next != null){
                        slow = slow.next;
                        fast = fast.next.next;
                        if(slow == fast){
                                cycle = true;
                                break;
                        }
                }
                if(!cycle){
                        return;
                }
                slow = head;
                Node prev = null;
                while(slow != fast){
                        prev = fast;
                        slow = slow.next;
                        fast = fast.next;
                }
                prev.next = null;
        }

        public static void main(String[] args) {
                head = new Node(1);
                head.next = new Node(2);
                head.next.next = new Node(3);
                head.next.next.next = new Node(4);
                head.next.next.next.next = head.next.next;
                System.out.println(isCycle());
                removeCycle();
                System.out.println(isCycle());

        }
}
