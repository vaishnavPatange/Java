package in.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSet {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the word: ");
                String str = sc.next().toLowerCase();
                Set<Character>  set = new HashSet<>();
                for(int i=0; i<str.length(); i++){
                        set.add(str.charAt(i));
                }
                System.out.println("no of unique characters are : "+ set.size());
                System.out.print(" " + set);
        }
}
