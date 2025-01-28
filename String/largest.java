public class largest {
    public static void main(String args[]){
        // compareTo funtion consider capital and small letter as same
        /*String fruits[] = {"mango", "apple", "Banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);*/

        // second in built fuction conpareToIgnoreCase
        // this funtion consider capital and small letter diff capital > small

        String s1 = "Apple";
        String s2 = "apple";
        if(s1.compareToIgnoreCase(s2) > 0){
            System.out.println(s1 + " : Is largest");
        } else {
            System.out.println("not");
        }

    }
}
