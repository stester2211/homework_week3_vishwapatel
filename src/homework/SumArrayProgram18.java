package homework;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class SumArrayProgram18
{

    public static void main(String[] args)
    {
       sum();
    }

    public static void sum()
    {
        int my_array[] = {10,20,30,40,50};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum of array value is " + sum);
    }

}
