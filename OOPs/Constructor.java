public class Constructor {
    public static void main(String args[]){
        Student s2 = new Student();
        Student s1 = new Student("Vaishnav");
        Student s3 = new Student("Samarth", 17);
        System.out.println(s1.name);
        System.out.println(s3.name + " " + s3.age);
    }
}

class Student{
    String name;
    int age;
    
    Student(){
        System.out.println("This is non parameterized constructor");
    }

    Student(String name){ // this constructor
        this.name = name;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}