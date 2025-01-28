public class CharAt {
    public static void letter(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void spaces(String name){
        int spaces =0;
        String s = " ";
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == s.charAt(0)){
                spaces++;
            }
        }
        System.out.println(spaces);
    }
    public static void main(String args[]){
    String name = " Va is h na v";
    //System.out.println(name.charAt(5));
    //letter(name);
    spaces(name);
}
}
