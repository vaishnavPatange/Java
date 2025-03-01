import java.util.ArrayList;

public class Intro {
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();

                //Operations on ArrayList

                //adding an element
                list.add(3); //O(1)
                list.add(5);
                list.add(7);
                list.add(9);
                list.add(18);

                list.add(3, 45); //O(n)

                System.out.println(list);
                //get operation       //O(1)
//                System.out.printf("element is at no %d is: %d", 3,list.get(3));

                //remove operation     //O(n)
//                list.remove(3);
//                System.out.println(list);

                // set element at no       //O(n)
//                list.set(3, 15);
//                System.out.println(list);

                // does arraylist contains certain element result  T/ F    //O(n)
//                System.out.println(list.contains(85));

                //Size of an Arraylist
                System.out.println(list.size());


        }
}