package in.collectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class IsLLPalindrome {
        public static void main(String[] args) {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(1); list.add(2); list.add(3); list.add(1);
                LinkedList<Integer> list2 = new LinkedList<>(list);
                Collections.reverse(list2);
                if(list.equals(list2)){
                        System.out.println("Palindrome");
                } else{
                        System.out.println("Not Palindrome");
                }
        }
}
