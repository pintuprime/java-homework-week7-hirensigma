package homework_week3;
import java.util.Scanner;
//Write a java program to input any number and find out if it’s odd or even
public class Program6_FindOddEven
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);//scanner used
        System.out.println("Enter a Number");
        int num = reader.nextInt();
        reader.close();//scanner close
        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + "is odd");
        }
    }
}
