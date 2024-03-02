// 8: Program to get the ip address of a website using InetAddress class.

import java.net.InetAddress;

public class exp8 {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            System.out.println("Ip address of google is  "+inet.getHostAddress());
        } catch (Exception e) {
            System.out.println("exception"+e);
        }
    }
}
