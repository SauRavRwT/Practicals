// 9: factorial socket programming. 

import java.io.*;
import java.net.*;

public class factorialserver {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Create a server socket listening on port 12345
            
            while (true) {
                System.out.println("Server waiting for client...");
                Socket clientSocket = serverSocket.accept(); // Wait for a client to connect
                
                System.out.println("Client connected");
                
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Input stream from client
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Output stream to client
                
                int number = Integer.parseInt(in.readLine()); // Read the number sent by the client
                
                long factorial = calculateFactorial(number); // Calculate the factorial
                
                System.out.println("Factorial of " + number + " is: " + factorial); // Print factorial result on server
                
                out.println(factorial); // Send the factorial back to client
                
                clientSocket.close(); // Close the connection with the client
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
