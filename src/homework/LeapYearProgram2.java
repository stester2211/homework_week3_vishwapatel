package homework;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if
 * it is leap year or not?
 */

import java.util.Scanner;

public class LeapYearProgram2
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        isLeap();
    }

    public static void isLeap()
    {

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        // if year is divided by 4
        // if the year is century
        // if year is divided by 400
        // then year is leap year

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
