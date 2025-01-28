public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.schoolName = "Nutan";
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;
}
