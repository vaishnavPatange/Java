public class SubSets {
        public static void main(String[] args) {
                printSubSetS("abc", "", 0);
        }

        public static void printSubSetS(String str, String newStr, int i){
                if(i == str.length()){
                        if(newStr.isEmpty()){
                                System.out.println("Empty String");
                        } else {
                                System.out.println(newStr);
                        }
                        return;
                }

                // yes
                printSubSetS(str, newStr+str.charAt(i), i+1);
                // no
                printSubSetS(str, newStr, i+1);

        }

}
