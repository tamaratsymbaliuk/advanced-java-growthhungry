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
        List<Student> students = 
    }
}
