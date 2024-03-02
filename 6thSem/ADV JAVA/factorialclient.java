// 9: factorial socket programming. 

import java.io.*;
import java.net.*;

public class factorialclient {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 12345); // Connect to the server running on localhost:12345

      BufferedReader userInput = new BufferedReader(
        new InputStreamReader(System.in)
      ); // Reader for user input
      BufferedReader in = new BufferedReader(
        new InputStreamReader(socket.getInputStream())
      ); // Input stream from server
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Output stream to server

      System.out.println("Enter a number:");
      int number = Integer.parseInt(userInput.readLine()); // Read the number from user

      out.println(number); // Send the number to server

      String response = in.readLine(); // Receive the response from server
      System.out.println("Server response: " + response);

      socket.close(); // Close the connection with the server
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
