package homework;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class oddEvenProgram6
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        isOddEven();
    }
    public static void isOddEven()
    {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");
    }
}
