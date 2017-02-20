package in.orangecounty.sajin;

/**
 * Created by sajin on 04/02/17.
 */
import java.io.*;
import java.util.Scanner;
public class twoclass {
    public static void main(String args[]) {

        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values For Calculation");

        a=sc.nextFloat();
        b=sc.nextFloat();

        float c=a/b;
        System.out.printf("%.2f",c);
    }
}
