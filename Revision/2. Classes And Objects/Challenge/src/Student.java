public class Student {

        int age;
        String name;
        int rollNo;
        int standard;
        int id;
        String Guide;
        String course;
        String stream;


        public Student(int age, String name, int rollNo, int standard, int id, String guide, String course, String stream) {
                this.age = age;
                this.name = name;
                this.rollNo = rollNo;
                this.standard = standard;
                this.id = id;
                Guide = guide;
                this.course = course;
                this.stream = stream;
        }

        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("Student{");
                sb.append("age=").append(age);
                sb.append(", name='").append(name).append('\'');
                sb.append(", rollNo=").append(rollNo);
                sb.append(", standard=").append(standard);
                sb.append(", id=").append(id);
                sb.append(", Guide='").append(Guide).append('\'');
                sb.append(", course='").append(course).append('\'');
                sb.append(", stream='").append(stream).append('\'');
                sb.append('}');
                return sb.toString();
        }

        public static void main(String[] args) {
                Student st1 = new Student(18, "Ramesh", 124, 3, 183938, "Pande", "Graphical Design", "CSE");
                Student st2 = new Student(18, "RSuresh", 125, 4, 183998, "Raju", "UI\\UX", "ECE");

                System.out.println(st1);
                System.out.println(st2);
        }

}
