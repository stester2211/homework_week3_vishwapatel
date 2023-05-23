package homework;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message
 * “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class ResultProgram3
{
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args)
    {
        ResultProgram3 obj=new ResultProgram3();
        obj.result();
    }

    public void result()
    {
        System.out.print("Enter Student Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Roll Number : ");
        int rollNumber=sc.nextInt();
        System.out.print("Enter marks for Math : ");
        int mathMark=sc.nextInt();
        if (mathMark >= 100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(mathMark);
        }

        System.out.print("Enter marks for Science : ");
        int scienceMark= sc.nextInt();
        if (scienceMark >= 100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(scienceMark);
        }

        System.out.print("Enter marks for English : ");
        int englishMark=sc.nextInt();
        if (englishMark>= 100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(englishMark);
        }

        int totalMarks=mathMark+scienceMark+englishMark;

        double percentage = (totalMarks * 100) / 300;
        String grade;
        String result;

        if(mathMark>=35 && scienceMark>=35 && englishMark>=35)
        {
            result = "Pass";

        }
        else
        {
            result = "Fail";
        }

        if(percentage>=80 && result=="pass"){
            grade = "A+";
        }else if(percentage>=60 && percentage<80 && result=="pass"){
            grade = "A";
        }
        else if(percentage>=50 && percentage<60 && result=="pass"){
            grade = "B";
        }
        else if(percentage>=35 && percentage<50 && result=="pass"){
            grade = "C";
        }
        else {
            grade = " ";
        }

        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|           Mark Sheet           |");
        System.out.println("|________________________________|");
        System.out.println("|     Name     :" +name+ "          |");
        System.out.println("|     Roll No  :" +rollNumber+ "                |");
        System.out.println("|________________________________|");
        System.out.println("|     Subjects :   Marks         |");
        System.out.println("|________________________________|");
        System.out.println("|     Math     :" +mathMark+ "                |");
        System.out.println("|     Science  :" +scienceMark+ "                |");
        System.out.println("|     English  :" +englishMark+ "                |");
        System.out.println("|________________________________|");
        System.out.println("|     Total     :" +totalMarks+ "|");
        System.out.println("|________________________________|");
        System.out.println("|     Percentage:" +percentage+"            |");
        System.out.println("|     Result    :"    +result+"            |");
        System.out.println("|     Grade     :" +grade+"               |");
        System.out.println("|________________________________|");


    }
}
