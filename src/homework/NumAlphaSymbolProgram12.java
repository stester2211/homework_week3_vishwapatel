package homework;
/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class NumAlphaSymbolProgram12
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        num();
    }
    public static void num()
    {
        System.out.print("Enter the value : ");
        char ch=sc.next().charAt(0);
        if (ch >= 'a' && ch<='z' || ch >= 'A' && ch <='Z')
        {
            System.out.println("This is alphabet");
        }
        else if (ch>='0' && ch<='9')
        {
            System.out.println("This is number");
        }
        else
        {
            System.out.println("This is symbol");
        }
    }
}
