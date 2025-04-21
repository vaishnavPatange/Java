import java.util.ArrayList;
public class StackUsingArrayList {
       public static class Stack{
               ArrayList<Integer> list = new ArrayList<>();

               public boolean isEmpty(){
                       return list.isEmpty();
               }

               public void push(int val){
                       list.add(val);
               }

               public int pop(){
                       if(isEmpty()){
                               return -1;
                       }
                       int val = list.getLast();
                       list.removeLast();
                       return val;
               }

               public int peek(){
                       if(isEmpty()) return -1;
                       return list.getLast();
               }

               @Override
               public String toString() {
                       return String.valueOf(list);
               }
       }

       public static void main(String[] args) {
               Stack stack = new Stack();
               System.out.println(stack.isEmpty());
               stack.push(2);
               stack.push(5);
               stack.push(10);
               stack.push(34);
               stack.push(8479);
               System.out.println(stack);
               System.out.println(stack.pop());
               System.out.println(stack.pop());
               System.out.println(stack.pop());
               System.out.println(stack);
               System.out.println(stack.peek());
       }

}