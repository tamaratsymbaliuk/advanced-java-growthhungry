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
    
}
