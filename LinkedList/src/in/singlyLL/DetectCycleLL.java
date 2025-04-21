package in.singlyLL;

public class DetectCycleLL {
        public static class Node{
                public int data;
                Node next;
                public Node(int data){
                        this.data = data;
                        this.next = null;
                }
        }

        public static Node head;

        public static boolean isCycle(){  // Floyd's Cycle Finding Algorithm
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

        public static void main(String[] args) {
                head = new Node(1);
                head.next = new Node(2);
                head.next.next = new Node(3);
                head.next.next.next = new Node(4);
                head.next.next.next.next = new Node(5);
//                1 -> 2 -> 3 -> 4 -> 2
                System.out.println(isCycle());
        }

}
