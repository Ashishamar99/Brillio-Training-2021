package image_converter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ConvertColorToBlackAndWhite {

    //A Program to Copy Data
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename,filenameT;
        System.out.println("Enter the Coloured Image: ");
        filename = sc.nextLine();
        System.out.println("Enter the Converted File Name: ");
        filenameT = sc.nextLine();
        FileInputStream f1 = new FileInputStream(filename);  //Read Mode
        FileOutputStream f2 = new FileOutputStream(filenameT); //Write Mode
        int n1,i=0;
        while((n1=f1.read())!=-1)  //n1 is the byte returned
        // -1 indicates the EOF
        {
            if(i<=30)
            {
                f2.write(n1);
            }
            else
            {

                f2.write(n1);
                f2.write(0);
                f2.write(0);
                f1.read();
                f1.read();
            }
            i++;
        }
        f1.close();
        f2.close();
        System.out.println("\nJob Over");
    }
}