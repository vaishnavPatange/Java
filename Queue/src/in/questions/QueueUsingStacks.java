package in.questions;

import java.util.Stack;

public class QueueUsingStacks {

        static class Queue{
               private Stack<Integer> s1;
               private Stack<Integer> s2;

                public Queue(){
                        this.s1 = new Stack<>();
                        this.s2 = new Stack<>();
                }

                boolean isEmpty(){
                        return s1.isEmpty();
                }

                void add(int data){
                        if(isEmpty()){
                                s1.push(data);
                                return;
                        }
                        while(!s1.isEmpty()){
                                s2.push(s1.pop());
                        }
                        s1.push(data);
                        while(!s2.isEmpty()){
                                s1.push(s2.pop());
                        }
                }

                int remove(){
                        if(s1.isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        return s1.pop();
                }

                int peek(){
                        if(s1.isEmpty()){
                                System.out.println("Queue is Empty");
                                return Integer.MIN_VALUE;
                        }
                        return s1.peek();
                }

                void print(){
                        System.out.println(s1);
                }

        }

        public static void main(String[] args) {
                Queue q = new Queue();
                q.add(1);
                q.add(2);
                q.add(3);
                q.print();
                System.out.println(q.remove());
                q.print();
                System.out.println(q.peek());
        }
}
