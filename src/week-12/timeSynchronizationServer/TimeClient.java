package timeSynchronizationServer;
import java.io.*;
import java.net.*;

/*
a Java program that demonstrates network programming concepts by creating a
Time Synchronization Server and Client application.

Connect to the server and display the received time.*/

public class TimeClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to server");
            String serverTime = in.readLine();
            System.out.println("Server time: " + serverTime);

        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
