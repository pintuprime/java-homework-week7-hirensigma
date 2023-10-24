package homework_week3;
import java.util.Scanner;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16_PositiveNegativeZero
{
    static int n;//static variable
//main method (Called static method directly)
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//scanner used
        System.out.println("Input a Number");
        n = in.nextInt();
        abc();//static method called
        in.close();//scanner close
    }
    //static method and if,else,if loop used
    public static void abc()
    {
        if (n > 0)
        {//if else if loop used
            System.out.println("Number is Positive");
        } else if (n < 0)
        {
            System.out.println("Number is Negative");
        } else
        {
            System.out.println("Number is Zero");
        }
    }
}
