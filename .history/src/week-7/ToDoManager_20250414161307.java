import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    public static void saveTasksToFile(String filePath, List<ToDo> tasks) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ToDo task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
            
    
}
