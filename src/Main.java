import model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",34,"HN");
        Student student2 = new Student("Hoai",18,"Vinh");
        Student student3 = new Student("Vinh",29,"SG");
        Student student4 = new Student("THuong",32,"VP");
        Student student5 = new Student("Quyen",19,"Ca Mau");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(7,student2);
        studentMap.put(3,student3);
        studentMap.put(9,student4);
        studentMap.put(5,student5);


        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }


        System.out.println("======Set======");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student: students) {
            System.out.println(student.toString());
        }

        //   HashMap phương thức Entry hỗ trợ sắp xếp lần lượt theo các value tăng dần.
        // Khó phân biệt quá

    }
}
