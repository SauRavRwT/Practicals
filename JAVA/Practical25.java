// Program in java to demonstrate file writer, file reader and buffer reader

import java.io.*;

class program25 {

  public static void main(String s[]) throws IOException {
    String name;
    FileWriter fw = new FileWriter("Demo1.txt");
    name = "INDIA";
    fw.write(name);
    name = "\n";
    fw.write(name);
    name = "DELHI";
    fw.write(name);
    fw.close();
    String newname;
    FileReader fr = new FileReader("Demo1.txt");
    BufferedReader br = new BufferedReader(fr);
    newname = br.readLine();
    System.out.println(newname);
    newname = br.readLine();
    System.out.println(newname);
    br.close();
    fr.close();
  }
}
