public class FunOver{
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b, float c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(4, 234));
        System.out.println(sum(34.5f, 34.6f,245.45f));
    }
}