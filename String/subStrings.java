public class subStrings {
    public static String getSubString(String str, int si, int ei){
        String sub = "";
        for(int i=si; i<ei; i++){
            sub += str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        //System.out.println(getSubString(str, 0, 6));

        // in built function for subString
        System.out.println(str.substring(0, 5));
    }
}
