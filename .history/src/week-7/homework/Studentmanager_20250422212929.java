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
        List<Student> students = loadStudents(); // from file
        boolean found = false;
        for (Student student : students) {
            // update in memory
            if (student.getId() == id) {
                student.setAge(age);
                student.setGrade(grade);
                found = true;
                break;
        }
    }
    if (found) {
        saveStudents(students); // persist the change to write the updated list back to the file
        System.out.println("Student updated successfully.");
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
}

    public void deleteStudent(int id) throws IOException  {
        List<Student> students = loadStudents();
        boolean found = false;

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                found = true;
                break;
            }
        }
        if (found) {
            saveStudents(students);
            System.out.println("Student was deleted successfully.");
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
  }
    
    public List<Student> loadStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) {
            while ()
        }
    }


 }


