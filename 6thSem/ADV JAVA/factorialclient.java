// 9: factorial socket programming.

import java.io.*;
import java.net.*;

public class factorialclient {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 12345);
      BufferedReader userInput = new BufferedReader(
        new InputStreamReader(System.in)
      );
      BufferedReader in = new BufferedReader(
        new InputStreamReader(socket.getInputStream())
      );
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      System.out.println("Enter a number:");
      int number = Integer.parseInt(userInput.readLine());

      out.println(number);

      String response = in.readLine();
      System.out.println("Server response: " + response);

      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
