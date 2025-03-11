package in.map;
import java.util.HashMap;
import java.util.Map;
public class MapInterface {
        public static void main(String[] args) {
                Map<String, Integer> map = new HashMap<>();
                map.put("Vaishnav", 98); map.put("Samart", 100);
                map.put("Rahul", 88);  map.put("Raju", 76);
                map.put("Akshay", 45);

                System.out.println(map.get("Raju"));
                System.out.println(map.size());
                System.out.println(map.keySet());

                for (String key : map.keySet()) {
                        System.out.println(key +" : "+ map.get(key));
                }

        }
}
