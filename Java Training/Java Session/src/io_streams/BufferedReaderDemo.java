package io_streams;
//
//import java.io.*;
//
//public class BufferedReaderDemo {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter Your Name:: ");
//        String s1 = br.readLine();
//        System.out.println(s1);
//
//        //Processing csvs in a txt file.
//
//        String fileName = "C:\\Users\\Ashish\\Desktop\\Launch.bat";
//        BufferedReader br1 = new BufferedReader(new FileReader(fileName));
//    }
//}

import java.io.*;

public class BufferedReaderDemo {

    /*
    IO Stream -> To Read and Write Data from Files
                    This concept is Flat file System
                    (If done by other -> DBMS)
    Java gives two types of classes:
    1) Reader -> Text or ASCII format
    2) Stream -> Multimedia, Binary Data ( In the form of bits)

    BufferReaders -> Helps to take the data from Buffer and connect to Memorirs
    (When something is typed, the data is first stored in Buffer)


    In C compiler, we can access the buffer using pointers.


     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String s1 = br.readLine();
        System.out.println(s1);
        //.csv - comma separated values

        String fileName = "C:\\Users\\Ashish\\Desktop\\inp.txt";
        String outPutFileName = "C:\\Users\\Ashish\\Desktop\\op.txt";
        BufferedReader br1 = new BufferedReader(new FileReader(fileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outPutFileName));
        String str1;
        while((str1=br1.readLine())!=null)
        {
            int sum = 0;
            String[] str2 = str1.split(",",0);
            for(String x:str2)
            {
                sum = sum+Integer.parseInt(x);
            }
            bw.write(str1+" :"+sum);
            bw.newLine(); //This is necessary for BufferWrited but not BufferReader

        }
        br1.close();
        bw.close();
        System.out.println("Your data is Processed");

    }
}
