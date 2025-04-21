package in.questions;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {

        public static class Stack{
                Queue<Integer> q1 = new LinkedList<>();
                Queue<Integer> q2 = new LinkedList<>();

                public boolean isEmpty(){
                        return q1.isEmpty() && q2.isEmpty();
                }

                public void add(int data){
                        if(isEmpty()){
                                q1.add(data);
                        }
                        if(!q1.isEmpty()){
                                q1.add(data);
                        } else{
                                q2.add(data);
                        }
                }

                public int remove(){
                        if(isEmpty()){
                                System.out.println("Stack is Empty");
                                return Integer.MIN_VALUE;
                        }
                        int top = -1;
                        if(!q1.isEmpty()){
                                while(!q1.isEmpty()){
                                        top = q1.remove();
                                        if(q1.isEmpty()){
                                                break;
                                        }
                                        q2.add(top);
                                }
                        } else{
                                while(!q2.isEmpty()){
                                        top = q2.remove();
                                        if(q2.isEmpty()){
                                                break;
                                        }
                                        q1.add(top);
                                }
                        }
                        return top;
                }

                public int peek(){
                        if(isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        int top = -1;
                        if(!q1.isEmpty()){
                                while(!q1.isEmpty()){
                                        top = q1.peek();
                                        q2.add(top);
                                }
                        } else{
                                while(!q2.isEmpty()){
                                        top = q2.peek();
                                        q1.add(top);
                                }
                        }
                        return top;
                }

        }

        public static void main(String[] args) {
                Stack s = new Stack();
                s.add(1);
                s.add(2);
                s.add(3);

                while(!s.isEmpty()){
                        System.out.println(s.remove());
                }
        }

}
