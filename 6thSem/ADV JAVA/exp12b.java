import java.io.*;
import java.net.*;

public class exp12b {
    public static void main(String[] args) {
        final String SERVER_HOST = "localhost";
        final int SERVER_PORT = 8888;
        final String FILE_PATH = "received_file.txt";

        try {
            // Connect to server
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Connected to server");

            // Create input stream
            InputStream in = socket.getInputStream();
            BufferedInputStream bufferedIn = new BufferedInputStream(in);

            // Create output stream
            FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
            BufferedOutputStream bufferedFileOut = new BufferedOutputStream(fileOut);

            // Transfer file data
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedIn.read(buffer)) != -1) {
                bufferedFileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("Ravita received file successfully");

            // Close streams and socket
            bufferedFileOut.close();
            bufferedIn.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
