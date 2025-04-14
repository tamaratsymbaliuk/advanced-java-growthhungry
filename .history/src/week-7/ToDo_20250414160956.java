// Write a Java program to create, save, read, and update a to-do list stored in a text file
public class ToDo {
    private int id;
    private String task;
    private boolean isComplete;

    public ToDo(int id, String task, boolean isComplete) {
        this.id = id;
        this.task = task;
        this.isComplete = isComplete;
    }

    public int getId() {
        return id;
        
    public String getTask() {
        return task;
    }

     public boolean isComplete() {
         return isComplete;
    
 }
}
