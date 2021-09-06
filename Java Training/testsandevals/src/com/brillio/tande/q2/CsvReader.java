package com.brillio.tande.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CsvReader {

    public void readCSV(){

        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ashish\\Desktop\\Brillio\\Brillio-Training-2021\\Java Training\\testsandevals\\src\\com\\brillio\\tande\\q2\\Details.csv"));
            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                Arrays.stream(employee).forEach(System.out::println);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
