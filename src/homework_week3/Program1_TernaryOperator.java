package homework_week3;
import java.util.Scanner;
/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Program1_TernaryOperator {
    public static void num() //static method
    {
        Scanner s = new Scanner(System.in);//scanner used
        System.out.println("Enter the Number: ");
        int number = s.nextInt();
        String evenOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
        s.close();//scanner close ? is it ok to close scanner in static method?
    }
    //main method
    public static void main(String[] args)
    {
        num();//called static method
    }
}
