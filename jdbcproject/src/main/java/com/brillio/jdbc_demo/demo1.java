package com.brillio.jdbc_demo;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        try {

//            Connection co = DBConnectivity.getConnection();
//            System.out.println("Connection is successful");
            SchoolDAOB schoolDAOB = new SchoolDAOB();
            List<SDetailsDTO> l1 = schoolDAOB.getAllStudents();

            l1.forEach(System.out::println);

            System.out.print("Enter sid to display:: ");
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            System.out.println(schoolDAOB.getAnyStudent(s1));

            System.out.print("Enter New Record's SID:: ");
            String newSid = sc.nextLine();
            System.out.print("Enter New Record's First Name:: ");
            String newFname = sc.nextLine();
            System.out.print("Enter New Record's Last Name:: ");
            String newLname = sc.nextLine();
            System.out.print("Enter New Record's DOB:: ");
            String newDob = sc.nextLine();
            System.out.print("Enter New Record's Address:: ");
            String newAddr = sc.nextLine();

            schoolDAOB.insertStudentDetailsRecord(newSid, newFname, newLname, newDob, newAddr);

            System.out.println(schoolDAOB.getAnyStudent(newSid));
            l1 = schoolDAOB.getAllStudents();
            l1.forEach(System.out::println);

            System.out.print("Enter sid to delete:: ");
            String dSid = sc.nextLine();
            schoolDAOB.DeleteAnyStudent(dSid);

            l1 = schoolDAOB.getAllStudents();
            l1.forEach(System.out::println);

            System.out.print("Enter sid of the record to update:: ");
            String uSid = sc.nextLine();
            System.out.print("Enter Record's New SID:: ");
            String newUSid = sc.nextLine();
            System.out.print("Enter Record's New First Name:: ");
            String newUFname = sc.nextLine();
            System.out.print("Enter Record's New Last Name:: ");
            String newULname = sc.nextLine();
            System.out.print("Enter Record's New DOB:: ");
            String newUDob = sc.nextLine();
            System.out.print("Enter Record's New Address:: ");
            String newUAddr = sc.nextLine();

            schoolDAOB.UpdateAnyStudent(newUSid, newUFname, newULname, newUDob, newUAddr, uSid);
            l1 = schoolDAOB.getAllStudents();
            l1.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Connection failure - " + e.getMessage());
        }
    }

}