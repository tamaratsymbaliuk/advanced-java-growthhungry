import java.io.*;
import java.util.ArrayList;

public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

class StudentScoreProcessor {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users"))
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",")
            }
        }
    }
}
