import java.io.*;
import java.net.*;

public class exp11b {
    public static void main(String[] args) {
        final String SERVER_HOST = "localhost";
        final int SERVER_PORT = 8888;

        try {
            // Connect to the server
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Connected to server on " + SERVER_HOST + ":" + SERVER_PORT);

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send messages to the server
            out.println("Hello, Ravita!");
            out.println("How are you?");

            // Receive responses from the server
            String response;
            while ((response = in.readLine()) != null) {
                System.out.println("Server response: " + response);
            }

            // Close streams and socket
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
