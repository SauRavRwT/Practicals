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

  void updateRecord() {
    int Hnum, Hrooms;
    String Hloc, Howner;
    Scanner sc = new Scanner(System.in);
    try {
      Statement SMT;
      String QU;
      SMT = CO.createStatement();
      System.out.println("ENTER HOUSE NUMBER TO UPDATE ");
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
        "UPDATE HOUSE SET H_LOCALITY = '" +
        Hloc +
        "', H_ROOMS = " +
        Hrooms +
        ", H_OWNER = '" +
        Howner +
        "' WHERE H_NO = " +
        Hnum +
        ";";
      SMT.executeUpdate(QU);
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught During Update .....");
    }
  }
}

public class program30 {

  public static void main(String args[]) {
    DBConnectivity Obj = new DBConnectivity();
    Obj.makeConnection();
    Obj.updateRecord();
    Obj.displayNextAll();
    Obj.closeConnection();
  }
}
