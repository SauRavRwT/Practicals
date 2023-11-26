// Design a program in java to implement client-server TCP/IP socket application, which exchanges strings among them.

// Server.java
import java.io.*;
import java.net.*;
class server
{
    public static void main(String args[])
    {
        int port=6666;
        try
        {
            ServerSocket ss=new ServerSocket(port);
            System.out.println("WAITING FOR CLIENT ");
            Socket socket=ss.accept();
            System.out.println("GOT A CLIENT ");
            InputStream sin=socket.getInputStream();
            OutputStream sout=socket.getOutputStream();
            DataInputStream in=new DataInputStream(sin);
            DataOutputStream out=new DataOutputStream(sout);
            String line=null;
            while(true)
            {
                line=in.readUTF();
                System.out.println("LINE RECEIVED FROM CLIENT "+line);
                System.out.println("SENDING LINE BACK....");
                out.writeUTF(line);
                out.flush();
                System.out.println("WAITING FOR ANOTHER LINE");
            }
        }
        catch(IOException e)
        {
            System.out.println("EXCEPTION OCCURRED………");
        }
    }
}


// Client.java
import java.io.*;
import java.net.*;

class client {

  public static void main(String args[]) {
    int serverport = 6666;
    String address = "127.0.0.1";
    try {
      InetAddress ip = InetAddress.getByName(address);
      System.out.println("SERVER IP ADDRESS " + address);
      System.out.println("SERVER PORT " + serverport);
      Socket socket = new Socket(ip, serverport);
      InputStream sin = socket.getInputStream();
      OutputStream sout = socket.getOutputStream();
      DataInputStream in = new DataInputStream(sin);
      DataOutputStream out = new DataOutputStream(sout);

      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      String line = null;
      String msg = null;
      while (true) {
        line = br.readLine();
        if (line.equals("end")) {
          break;
        }
        out.writeUTF(line);
        out.flush();
        msg = in.readUTF();
        System.out.println("DATA RECEIVED FROM SERVER " + msg);
      }
    } catch (IOException e) {
      System.out.println("EXCEPTION OCCURRED………");
    }
  }
}
