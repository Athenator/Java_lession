package urok2;
import java.util.*;
import urok2.model.*;

public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student("Олегова",2,5.0, 3);
        Student Student2 = new Student("Попова",1,7.0, 2);
        Student Student3 = new Student("Денисова",4,4.0, 4);
        Student Student4 = new Student("Семенова",2,9.0, 5);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(Student1);
        listStudent.add(Student2);
        listStudent.add(Student3);
        listStudent.add(Student4);
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            if((student.getMark() >= 2) && (student.getMark() <= 5) && 
                (student.getMark()% 2 == 1) && (student.getSurName().endsWith("ова"))){
                System.out.println("Student = " + student.getSurName() + 
                " Salary = " + student.getSalary());
            }
        }
      
    }
}
