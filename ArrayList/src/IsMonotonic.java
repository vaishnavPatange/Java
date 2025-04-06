import java.util.ArrayList;

public class IsMonotonic {
        public static void main(String[] args){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(5); list.add(5); list.add(2);

                if(list.get(0) <= list.get(1)){
                        System.out.println(isMonotone(list, 0));
                }else{
                        System.out.println(isMonotone(list, 1));
                }
        }

        public static boolean isMonotone(ArrayList list, int num){
                if(num == 0){
                        for(int i=0; i<list.size()-1; i++){
                                int curr = (int)list.get(i);
                                int next = (int) list.get(i+1);
                                if(curr > next) return false;
                        }
                } else{
                        for(int i=0; i<list.size()-1; i++){
                                int curr = (int)list.get(i);
                                int next = (int) list.get(i+1);
                                if(curr < next) return false;
                        }
                }
                return true;
        }


}
