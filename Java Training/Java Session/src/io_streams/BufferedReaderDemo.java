package io_streams;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name:: ");
        String s1 = br.readLine();
        System.out.println(s1);

        //Processing csvs in a txt file.

        String fileName = "C:\\Users\\Ashish\\Desktop\\Launch.bat";
        BufferedReader br1 = new BufferedReader(new FileReader(fileName));
    }
}
