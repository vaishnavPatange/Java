public class QueueUsingLL {

        static class Node{
                int data;
                Node next;
                public Node(int data){
                        this.data = data;
                }
        }

        static class Queue{
                Node head;
                Node tail;

                boolean isEmpty(){
                        return head == null;
                }

                void add(int data){
                        Node newNode = new Node(data);
                        if(isEmpty()){
                                head = tail = newNode;
                                return;
                        }
                        tail.next = newNode;
                        tail = newNode;
                }

                int remove(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        int val = head.data;
                        head = head.next;
                        return val;
                }

                int peek(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        return head.data;
                }

        }

        public static void main(String[] args){
                Queue q = new Queue();
                q.add(1);
                System.out.println(q.remove());
        }


}
