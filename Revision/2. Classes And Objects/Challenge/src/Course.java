public class Course {

        static int maxCapacity;
        String courseName;
        int enrolledStudents;
//        int currentStudentIndex = 0;

        Course(String courseName){
                this.courseName = courseName;
        }

        public static void setMaxCapacity(int capacity){
                maxCapacity = capacity;
        }

        public void enrollStudent(){
                enrolledStudents++;
        }

        public void unEnrollStudent(){
                enrolledStudents--;
        }

}
