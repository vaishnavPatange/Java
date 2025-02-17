import java.util.Scanner;

public class UniqueSorted{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        str.replace(",", " ");
        
        char[] strArr = str.toCharArray();
        StringBuilder strB = new StringBuilder();
        
        for(int i=0; i<strArr.length; i++){
            char c = strArr[i];
            for(int j=0; j<strArr.length; j++){
                if(strArr[j] != c) continue;
                
            }
        }



    }


}