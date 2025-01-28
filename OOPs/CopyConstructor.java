public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Vaishnav";
        s1.roll = 123;
        s1.matrix[0] = 100;
        s1.matrix[1] = 90;
        s1.matrix[2] = 80;

        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.roll);
        s1.matrix[1] = 92;
        for(int i=0; i<3; i++){
            System.out.println(s2.matrix[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int matrix[];
    // shallow copy Constructor
   /*  Student(Student s1){
        matrix = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.matrix = s1.matrix;
        
    }*/

    // Deep copy constructor
    Student(Student s1){
        matrix = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<matrix.length; i++){
            this.matrix[i] = s1.matrix[i];
        }
    }

    Student(){
        matrix = new int[3];
    }
}
