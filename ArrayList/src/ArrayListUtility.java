import java.util.ArrayList;

public class ArrayListUtility {
        public  static ArrayList<Integer> initArrayList(){
                ArrayList<Integer> arrList = new ArrayList<>();
                for(int i=0; i<5 ; i++){
                        arrList.add(8 * i);
                }
                return  arrList;
        }
}
