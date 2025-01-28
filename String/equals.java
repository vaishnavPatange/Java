public class equals {
    public static void main(String args[]){
        String s1 = "my";
        String s2 = "my";
        String se = new String("my");

        if(s1 == s2){
            System.out.println("Same");
        } else{
            System.out.println("not same");
        }

        /*if(s1 == se){
            System.out.println("same");
        } else{
            System.out.println("not same");
        }*/

        if(s1.equals(se)){
            System.out.println("Same");
        }else{
            System.out.println("not same");
        }
    }
}
