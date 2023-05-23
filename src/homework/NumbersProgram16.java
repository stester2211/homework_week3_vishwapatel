package homework;
/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class NumbersProgram16
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        checkNumber();
    }
    static void checkNumber()
    {
        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        //check if number is positive, negative or zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
}
