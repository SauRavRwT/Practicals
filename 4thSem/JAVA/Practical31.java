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

  void deleteRecord() {
    int Hnum;
    Scanner sc = new Scanner(System.in);
    try {
      Statement SMT;
      String QU;
      SMT = CO.createStatement();
      System.out.println("ENTER HOUSE NUMBER, TO DELETE ");
      Hnum = sc.nextInt();
      QU = "DELETE FROM HOUSE WHERE H_NO = " + Hnum + ";";
      SMT.executeUpdate(QU);
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught During Delete .....");
    }
  }
}

public class program31 {

  public static void main(String args[]) {
    DBConnectivity Obj = new DBConnectivity();
    Obj.makeConnection();
    Obj.deleteRecord();
    Obj.displayNextAll();
    Obj.closeConnection();
  }
}
