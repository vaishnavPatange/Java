public class UpperCase {
    public static StringBuilder uppercase(String line){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(line.charAt(0));
        sb.append(ch);
        for(char c = 1; c<line.length(); c++){
            if(line.charAt(c) == ' ' && c < line.length()-1){
                sb.append(line.charAt(c));
                c++;
                sb.append(Character.toUpperCase(line.charAt(c)));
            } else{
                sb.append(line.charAt(c));
            }
        }
        return sb;
    }
    public static void main(String args[]){
        String line = "hi my name is vaishnav";
        System.out.println(uppercase(line));

    }
}
