package homework;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA,
 * TA, DA, PF and Gross salary HRA = basic salary 10% DA = Basic salary 8%
 * TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;
public class GrossSalaryProgram5
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        grossSalary();
    }
    public static void grossSalary()
    {
        System.out.print("Please enter your Id: ");
        int  ID = sc.nextInt();
        System.out.print("Please enter your name: ");
        String name =sc.next();
        System.out.print("Please enter your salary: ");
        float salary =sc.nextFloat();
        float HRA =salary*10/100;
        float TA =salary*9/100;
        float DA = salary*8/100;
        float PF =salary*20/100;
        float gross = salary+HRA+TA+DA-PF;
        System.out.println("---------------------------------------------");
        System.out.println("|                salary slip                |");
        System.out.println("| Employer Id  : "+ID +"                       |");
        System.out.println("| Employee Name: " +name+"                     |");
        System.out.println("|___________________________________________|");
        System.out.println("| Basic salary : "+salary +"                    |");
        System.out.println("| HRA 10%      : " +HRA+"                    |");
        System.out.println("| TA 8%        : " +TA+"                     |");
        System.out.println("| DA 9%        : "+DA+"                    |");
        System.out.println("| PF - 20&     : "+PF+"                    |");
        System.out.println("|___________________________________________|");
        System.out.println("|Gross salary  : "+gross +"                    |");
        System.out.println("|===========================================|");

    }
}
