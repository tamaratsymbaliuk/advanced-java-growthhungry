public class Main {
    public static void main(String[] args) {
        String filePath = "tasks.txt";
        List<ToDo> tasks = new ArrayList<>();
        // Creating sample tasks
        tasks.add(new ToDo(1, "Buy groceries", false));
        tasks.add(new ToDo(2, "Finish homework", false));
tasks.add(new ToDo(3, "Call the bank", true));
try {
// Saving tasks to file
ToDoManager.saveTasksToFile(filePath, tasks);

        
    }
    
}
