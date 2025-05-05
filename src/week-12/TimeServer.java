import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
On receiving a request, send the current server time to the client.*/


public class TimeServer {
    private static final int PORT = 12345;
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Time Server started on port " + PORT);
        
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());
                new Thread(new ClientHandler(clientSocket)).start();
                }
            } catch (IOException e) {
                System.err.println("Server error: " + e.getMessage());  
            }
        }
}
