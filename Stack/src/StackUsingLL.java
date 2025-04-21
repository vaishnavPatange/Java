public class StackUsingLL {
        public static class Node{
                int data;
                Node next;
                Node(int data){
                        this.data = data;
                }
        }

        public static class Stack{
                Node head;
                public boolean isEmpty(){
                        return head == null;
                }

                public void push(int data){
                        Node newNode = new Node(data);
                        if(isEmpty()){
                                head = newNode;
                                return;
                        }
                        newNode.next = head;
                        head = newNode;
                }

                public int pop(){
                        if(isEmpty()){
                                System.out.println("Stack is empty");
                                return Integer.MIN_VALUE;
                        }
                        int val = head.data;
                        head = head.next;
                        return val;
                }

                public int peek(){
                        if(isEmpty()){
                                System.out.println("Stack is empty");
                                return Integer.MIN_VALUE;
                        }
                        return head.data;
                }

                @Override
                public String toString() {
                        StringBuilder sb = new StringBuilder("[ ");
                        Node temp = head;
                        while(temp != null){
                                sb.append(temp.data).append("  ");
                                temp = temp.next;
                        }
                        sb.append("]");
                        return sb.toString();
                }
        }

        public static void main(String[] args) {
                Stack stack = new Stack();
                stack.push(1);
                stack.push(2);
                stack.push(3);
                System.out.println(stack);
                stack.pop();
                System.out.println(stack);
                System.out.println(stack.peek());
                stack.pop();
                stack.pop();
                System.out.println(stack);
        }

}
