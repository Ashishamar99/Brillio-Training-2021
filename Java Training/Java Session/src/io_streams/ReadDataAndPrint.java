package io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataAndPrint {
    public static void main(String[] args) throws IOException {
        String fileName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name to read:: ");
        fileName = sc.nextLine();

        FileInputStream f1 = new FileInputStream(fileName);

        int n1;
        while((n1= f1.read()) != -1){ //In every file, there is a -1 character in the end of a file. We will be checking if the prg has reached the end of file.
            System.out.print((char) n1);
        }

        f1.close();
        System.out.println("\n Job Over.");
    }
}
