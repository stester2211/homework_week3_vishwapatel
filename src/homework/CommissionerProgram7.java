package homework;

/**
 * 7. Write a java program input sales id, seller's name,
 * sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000
 * 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */

import java.util.Scanner;

public class CommissionerProgram7
{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        commish();
    }

    public static void commish()
    {
        System.out.print("Enter sales ID :");
        int saleId=sc.nextInt();

        System.out.print("Enter seller's name : ");
        String name =sc.next();

        System.out.print("Enter sales amount : ");
        double amount=sc.nextDouble();

        System.out.print("Enter salary basis : ");
        int salary= sc.nextInt();


        double commissionrate;
        double commission=0.0;

        if (amount<10000)
        {
            commissionrate=2;
            commission=amount*0.02;
        }
        if(amount>=10000 && amount<20000)
        {
            commissionrate=5;
            commission=amount*0.05;
        }
        if(amount>=20000 && amount<30000)
        {
            commissionrate=10;
            commission=amount*0.1;
        }
        if(amount>=30000 && amount<50000)
        {
            commissionrate=20;
            commission=amount*0.2;
        }
        if(amount>=50000)
        {
            commissionrate=35;
            commission=amount*0.35;
        }

        System.out.println("Seller Id : "+saleId);
        System.out.println("Seller name : "+name);
        System.out.println("Sales amount : "+amount);
        System.out.println("Salary of employee: "+salary);
        System.out.println("Commission amount= "+commission);
    }
}


