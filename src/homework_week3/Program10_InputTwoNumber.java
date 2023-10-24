package homework_week3;
import java.util.Scanner;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program10_InputTwoNumber {
    public static void main(String args[])// main method
    {
        int first, second, add, subtract, multiply;
        float divide;
        Scanner scanner = new Scanner(System.in);//scanner used
        System.out.print("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();
        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;
        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
        scanner.close();// scanner close
    }
}

