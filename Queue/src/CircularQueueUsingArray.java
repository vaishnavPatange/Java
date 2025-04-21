public class CircularQueueUsingArray {

        public static class Queue{
                int[] arr;
                int rear;
                int front;
                public Queue(int length){
                        arr = new int[length];
                        rear = front = -1;
                }

                public boolean isEmpty(){
                        return front == -1;
                }

                public boolean isFull(){
                        return (rear >= 0 && rear == front);
                }

                public void add(int data){
                        if(isEmpty()){
                                rear = front = 0;
                                arr[rear] = data;
                        }
                        if(isFull()){
                                System.out.println("Queue is already full");
                                return;
                        }
                        rear = (rear + 1) % arr.length;
                        arr[rear] = data;
                }

                public int remove(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        int result = arr[front];
                        if(isFull()){
                                rear = front = -1;
                        } else{
                                front = (front + 1) % arr.length;
                        }
                        return result;
                }

        }

        public static void main(String[] args) {
                QueueUsingArray.Queue q = new QueueUsingArray.Queue(6);
                q.add(1);
                q.add(4);
                q.add(3);
                q.add(2);
                System.out.println(q);
                System.out.println(q.remove());
                System.out.println(q);
                System.out.println(q.peek());
        }
}
