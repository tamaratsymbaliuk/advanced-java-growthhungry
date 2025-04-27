import java.sql.*;

public class SQLiteExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Database URL for SQLite
            String url = "jdbc:sqlite:C:/Users/kalas/sql/assignment.db";

            // Establish connection
            conn = DriverManager.getConnection(url);

            // Create a statement
            stmt = conn.createStatement();

            // Create the table (if not exists)
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT," +
            "age INTEGER," +
            "grade REAL" +
            ")";
            stmt.executeUpdate(createTableSQL);

            // Insert data using PreparedStatement for better security and performance
            String insertSQL = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, "Alice");
            insertStmt.setInt(2, 20);
            insertStmt.setDouble(3, 9.5);
            insertStmt.executeUpdate();
        
            // ... (insert more data)
            // Retrieve and print data
            String selectSQL = "SELECT * FROM students";
            rs = stmt.executeQuery(selectSQL);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double grade = rs.getDouble("grade");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Grade: " + grade);
                System.out.println();
            }

            // Update a record
            String updateSQL = "UPDATE students SET grade = 9.2 WHERE id = 1";
            stmt.executeUpdate(updateSQL);

            // Delete a record
            String deleteSQL = "DELETE FROM students WHERE id = 2";
            stmt.executeUpdate(deleteSQL);

            // Close resources
            rs.close();
            insertStmt.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


Week 8 assignment
Create a Java application that interacts with a MySQL database. The application should
perform the following tasks:
1. Establish a database connection: Use the JDBC API to establish a connection to a
MySQL database.
2. Create a table: Create a table named "students" with the following columns: id (INT,
primary key), name (VARCHAR), age (INT), and grade (DOUBLE).
3. Insert data: Insert multiple student records into the table.
4. Retrieve data: Retrieve all student records and print them to the console.
5. Update data: Update the grade of a specific student.
6. Delete data: Delete a student record based on the ID.
7. Close the connection: Properly close the database connection to release
resources.
Additional Requirements:
● Error Handling: Implement proper error handling to catch and handle exceptions like
SQLException.
● Prepared Statements: Use prepared statements to prevent SQL injection
vulnerabilities.
● Input Validation: Validate user input to avoid invalid data.
● User Interface: Create a simple user interface (e.g., console-based or GUI-based) to
interact with the database.
