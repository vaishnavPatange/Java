import java.util.ArrayList;

public class PrintReverseArrayList {

        public static void main(String[] args) {
                ArrayList<Integer> arrList = new ArrayList<>();
                for(int i=0; i<5 ; i++){
                        arrList.add(i+1);
                }
                System.out.println(arrList);
                for(int i=arrList.size()-1; i>=0; i--){
                        System.out.print(arrList.get(i) + " ");
                }

        }

}
