package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private String filePath;

    public StudentManager(String filePath) {
        this.filePath = filePath;
    }
    
    public void addStudent(String student) throws IOException {
        List<Student> students = loadStudents();
        students.add(student);
        saveStudents(students);
    }

    public void displayStudents() throws IOException {
        List<Student> students = loadStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
", Age: " + student.getAge() + ", Grade: " + student.getGrade());
            }
        }
    }

    public void updateStudents(int id, int age, double grade) throws IOException {
        List<Student> students = loadStudents();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                student.setAge(age);
                student.setGrade(garde);
                found = true;
                break;
        }
    }
    
}

}
