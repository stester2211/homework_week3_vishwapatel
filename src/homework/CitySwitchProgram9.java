package homework;
/**
 * 9. Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class CitySwitchProgram9
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

        switch (ch)
        {
            case 'A':
                System.out.println("City is : Ahmedabad");
                break;
            case 'B':
                System.out.println("City is : Baroda");
                break;
            case 'C':
                System.out.println("City is : Chennai");
                break;
            case 'D':
                System.out.println("City is : Delhi");
                break;
            case 'E':
                System.out.println("City is : Erode");
                break;
            case 'F':
                System.out.println("City is : Faizabad");
                break;
            default:
                System.out.println("invalid entry");
        }
    }
}
