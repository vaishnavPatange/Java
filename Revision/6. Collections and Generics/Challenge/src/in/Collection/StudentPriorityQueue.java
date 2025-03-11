package in.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
        public static void main(String[] args) {
                PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                                return o1.getGrade() - o2.getGrade();
                        }
                });

                queue.offer(new Student("Vaishnav", 'A'));
                queue.offer(new Student("Vishal", 'B'));
                queue.offer(new Student("Sanket", 'D'));
                queue.offer(new Student("Rajesh", 'E'));
                queue.offer(new Student("Hari", 'A'));
                System.out.println(queue);
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
                System.out.println(queue.poll());
        }

        private static class Student{
                private final String name;
                private final char grade;

                Student(String name, char grade){
                        this.name = name;
                        this.grade = grade;
                }

                public String getName() {
                        return name;
                }
                public char getGrade(){
                        return grade;
                }

                @Override
                public String toString() {
                        return name + ": " + grade;
                }
        }

}
