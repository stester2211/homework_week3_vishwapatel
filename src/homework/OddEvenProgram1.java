package homework;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenProgram1
{
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args)
    {
        OddEvenProgram1 obj=new OddEvenProgram1();
        obj.isOddEven();
    }
    public void isOddEven()
    {
        System.out.print("Enter number to test : ");
        int number = sc.nextInt();

        sc.close();

        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +" is "+ result + " number");

    }
}
