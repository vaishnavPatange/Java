package in.Enums;

public class TestingEnums {
        public static void main(String[] args) {

                System.out.println("Days in week are");

                for (Days value : Days.values()) {
                        System.out.print(value.toString().toLowerCase() + " (" + value.getFeat() + ")");
                        System.out.println();
                }







//                System.out.println("Enums : Days in a week are: ");
//                int dayNum = 1;
//                for (Days value : Days.values()) {
//                        System.out.println(dayNum + " "+value);
//                        dayNum++;
//                }
        }
}
