import java.io.*;
import java.net.*;

public class exp14b {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8888;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);

            // Send messages to server
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter message to send to server: ");
                String message = reader.readLine();

                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                clientSocket.send(sendPacket);

                // Receive response from server
                byte[] receiveData = new byte[BUFFER_SIZE];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);

                String responseMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + responseMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
