package com.harman.Sampleproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Sample {


    public static void main(String[] args) {
        try {
            Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");

            Scanner input = new Scanner(System.in);
            String name, rollnum, admnum, college;
            System.out.println("enter the name");
            name = input.next();
            System.out.println("enter rollnum");
            rollnum = input.next();
            System.out.println("enter admnum");
            admnum = input.next();
            System.out.println("enter college");
            college = input.next();
            Statement stmt=c.createStatement();
            stmt.executeUpdate("INSERT INTO `student`( `name`, `rollnum`, `admnum`, `college`) VALUES('"+name+"',"+rollnum+","+admnum+",'"+college+"')");
            System.out.println("inserted sucessfully");

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
