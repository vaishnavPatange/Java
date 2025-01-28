public class swap{

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
    }
    public static void main(String args[]){

        int a = 5;
        int b = 10;
        swap(a,b);
        
    }
}

// here swap(a,b) is giving only values of a and b means swap(int num1, int num2) are just the copies of a and 
// which are in main function 
// And this thing is called as call by value
// Java functions always works on calls by value and not calls by reference(means passing the original value)