import java.util.*;
public class java{
    	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i =0; i<= test; i++){
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    if(K > N){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}