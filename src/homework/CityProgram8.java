package homework;
/**
 * 8. Input any alphabet from “A" to “F” and print their city name
 * accordingly (use if else) if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class CityProgram8
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        city();
    }
    public static void city()
    {
        System.out.print("Enter City Name : ");
        char ch=sc.next().charAt(0);

       if(ch=='A')
       {
           System.out.println("City is : Ahemdabad");
       }
       else if (ch == 'B')
       {
           System.out.println("City is : Baroda");
       }
       else if (ch == 'C')
       {
           System.out.println("City is : Chennai");
       }
       else if (ch == 'D')
       {
           System.out.println("City is : Delhi");
       }
       else if (ch == 'E')
       {
           System.out.println("City is : Erode");
       }
       else if (ch == 'F')
       {
           System.out.println("City is : Faizabad.");
       }
       else
       {
            System.out.println("invalid entry");
       }
    }
}
