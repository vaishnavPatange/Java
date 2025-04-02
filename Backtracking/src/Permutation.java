public class Permutation {
        public static void main(String[] args) {
                String str = "abc";
                findAllPermutation(str, "");
                System.out.println(total);
        }

        static int total = 0;

        public static void findAllPermutation(String str, String ans){
                if(str.isEmpty()){
                        System.out.println(ans);
                        total++;
                        return;
                }

                for (int i = 0; i < str.length(); i++) {
                        char curr = str.charAt(i);
                        String newStr = str.substring(0, i) +  str.substring(i+1);
                        findAllPermutation(newStr, ans+curr);
                }


        }

}
