package homework;
/**
 * 10. Write a java program to input any two number and ask user to enter their
 * symbol (+, -, /, *) find addition, Subtraction,
 * multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class OperatorProgram10
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        operator(a, b, op);
    }
    public static int operator(int a, int b, char op)
    {
        int ans = 0;

        if (op == '+')
        {
            ans = a + b;
        }
        else if (op == '-')
        {
            ans = a - b;
        }
        else if (op == '*')
        {
            ans = a * b;
        }
        else if (op == '/')
        {
           ans = a / b;
        }
        // printing the final result
        System.out.println("Your answer is : " + ans);
        return ans;
    }
}
