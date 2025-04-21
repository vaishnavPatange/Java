import java.util.Arrays;

public class QueueUsingArray {

        public static class Queue{
                int[] arr;
                int size;
                int rear;
                public Queue(int length){
                        this.arr = new int[length];
                        this.size = 0;
                        this.rear = -1;
                }

                public boolean isEmpty(){
                        return size == 0;
                }

                public void add(int data){
                        if(isEmpty()){
                                arr[0] = data;
                                rear = 0;
                                size++;
                                return;
                        }
                        rear = rear + 1;
                        arr[rear] = data;
                        size++;
                }

                public int remove(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        int val = arr[0];
                        for(int i=0; i<arr.length-1; i++){
                                arr[i] = arr[i+1];
                        }
                        rear = rear - 1;
                        size--;
                        return val;
                }

                public int peek(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        return arr[0];
                }

                @Override
                public String toString() {
                        final StringBuilder sb = new StringBuilder("{");
                        int i=0;
                       while (arr[i] != 0){
                                sb.append(arr[i] + " ");
                                i++;
                        }
                        sb.append('}');
                        return sb.toString();
                }
        }

        public static void main(String[] args) {
                Queue q = new Queue(6);
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