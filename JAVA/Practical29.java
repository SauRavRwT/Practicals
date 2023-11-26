// Program to create database connectivity using jdbc, create statement object create result set object and insert a record using prepared statement.

import java.io.*;
import java.sql.*;
import java.util.*;

class DBConnectivity {

  public Connection CO;

  void makeConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      CO =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/shiksha",
          "root",
          "ADMIN"
        );
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void closeConnection() {
    try {
      CO.close();
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void displayNextAll() {
    try {
      Statement SMT;
      ResultSet RS;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM HOUSE";
      RS = SMT.executeQuery(QU);
      RS.first();
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );
      while (RS.next()) {
        System.out.println(
          RS.getInt("H_NO") +
          RS.getString("H_LOCALITY") +
          RS.getInt("H_ROOMS") +
          RS.getString("H_OWNER")
        );
      }

      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught for Next.....");
    }
  }

  void insertRecord() {
    int Hnum, Hrooms;
    String Hloc, Howner;
    Scanner sc = new Scanner(System.in);
    try {
      Statement SMT;
      String QU;
      SMT = CO.createStatement();
      System.out.println("ENTER HOUSE NUMBER ");
      Hnum = sc.nextInt();
      System.out.println("ENTER HOUSE LOCALITY ");
      Hloc = sc.next();
      System.out.println("ENTER Mr. / Mrs. ");
      String salu = sc.next();
      System.out.println("ENTER HOUSE OWNER NAME ");
      Howner = sc.next();
      Howner = salu + " " + Howner;
      System.out.println("ENTER HOUSE ROOMS ");
      Hrooms = sc.nextInt();
      QU =
        "INSERT INTO HOUSE VALUES(" +
        Hnum +
        ",'" +
        Hloc +
        "'," +
        Hrooms +
        ",'" +
        Howner +
        "');";
      SMT.executeUpdate(QU);
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught During Insert .....");
    }
  }

  void insertRecordUsingPrepared() {
    int Hnum, Hrooms;
    String Hloc, Howner;
    Scanner sc = new Scanner(System.in);
    try {
      PreparedStatement PSMT;
      String QU;
      PSMT = CO.prepareStatement("INSERT INTO HOUSE VALUES(?,?,?,?)");
      System.out.println("ENTER HOUSE NUMBER ");
      Hnum = sc.nextInt();
      System.out.println("ENTER HOUSE LOCALITY ");
      Hloc = sc.next();
      System.out.println("ENTER Mr. / Mrs. ");
      String salu = sc.next();
      System.out.println("ENTER HOUSE OWNER NAME ");
      Howner = sc.next();
      Howner = salu + " " + Howner;
      System.out.println("ENTER HOUSE ROOMS ");
      Hrooms = sc.nextInt();
      PSMT.setInt(1, Hnum);
      PSMT.setString(2, Hloc);
      PSMT.setInt(3, Hrooms);
      PSMT.setString(4, Howner);
      PSMT.executeUpdate();
      PSMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught During Insert .....");
      System.out.println(Ee);
    }
  }
}

public class program29{

  public static void main(String args[]) {
    DBConnectivity Obj = new DBConnectivity();
    Obj.makeConnection();
    //Obj.insertRecord();
    Obj.insertRecordUsingPrepared();
    Obj.displayNextAll();
    Obj.closeConnection();
  }
}
