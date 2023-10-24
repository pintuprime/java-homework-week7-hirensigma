package homework_week3;
import java.util.Scanner;
// Write a program that tells us input value is number or an alphabet or symbol.
public class Program12_InputValueIsAlphabetNumSymbol
{
    public static void main(String[] args)
    {// main method
        Scanner scanner = new Scanner(System.in);// scanner used
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
       //if else if loop used
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " is A ALPHABET.");
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is A DIGIT");
        } else
        {
            System.out.println(ch + "is a SYMBOL");
        }
        scanner.close();//scanner closed
    }
}


