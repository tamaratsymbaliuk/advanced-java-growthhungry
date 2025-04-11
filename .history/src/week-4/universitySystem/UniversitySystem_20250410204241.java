public class UniversitySystem {

    public static void main(String[] args) {

        // Create departments

        Department csDept = new Department("Computer Science");

        // Create professors

        FullTimeProfessor profSmith = new FullTimeProfessor("Dr. John Smith", "Computer Science", 5000);

        AdjunctProfessor profBrown = new AdjunctProfessor("Dr. Mary Brown", "Computer Science", 3);

        // Add professors to the department

        csDept.addProfessor(profSmith);

        csDept.addProfessor(profBrown);

        // Create courses

        Course javaCourse = new Course("Java Programming", 3);

        Course dsCourse = new Course("Data Structures", 4);

        // Add courses to the department

        csDept.addCourse(javaCourse);

        csDept.addCourse(dsCourse);

        // Create students

        Student janeDoe = new Student("Jane Doe", 101);

        Student markLee = new Student("Mark Lee", 102);

        // Register students for courses

        javaCourse.addStudent(janeDoe);

        dsCourse.addStudent(markLee);

        // Assign grades

        janeDoe.addGrade(javaCourse, 90);

        markLee.addGrade(dsCourse, 85);

        // Print professor list and student grade report

        csDept.listProfessors();

        janeDoe.printGradeReport();

        markLee.printGradeReport();

    }
    
}
