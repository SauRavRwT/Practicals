// wap to impliment client-server file transfer.

import java.io.*;
import java.net.*;

public class exp12 {
    public static void main(String[] args) {
        final int PORT = 8888;
        final String FILE_PATH = "sample.txt";

        try {
            // Create ServerSocket
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started on port " + PORT);

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Create input stream
            FileInputStream fileIn = new FileInputStream(FILE_PATH);
            BufferedInputStream bufferedFileIn = new BufferedInputStream(fileIn);

            // Create output stream
            OutputStream out = clientSocket.getOutputStream();

            // Transfer file data
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedFileIn.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("File sent successfully");

            // Close streams and socket
            bufferedFileIn.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
