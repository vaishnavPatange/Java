package in.important;

public class DuplicatesString {
        public static void main(String[] args) {
                String str = "vvaisshnnavv";
                removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        }

        public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){

                if(idx == str.length()){
                        System.out.println(newStr);
                        System.out.println(str.length());
                        return;
                }

                char currChr = str.charAt(idx);
                if(map[currChr-'a']){
                        removeDuplicates(str, idx+1, newStr, map);
                } else{
                        map[currChr - 'a'] = true;
                        removeDuplicates(str, idx+1, newStr.append(currChr), map);
                }

        }

}
