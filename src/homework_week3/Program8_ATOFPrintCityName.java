package homework_week3;
import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Program8_ATOFPrintCityName
{
    static char J;//static variable
    public static void main(String[] args)// main method
    {
        Scanner s = new Scanner(System.in);// scanner used
        System.out.println("Enter any character from A to F (Uppercase Only) : ");
        J = s.next().charAt(0);
        s.close();// scanner close
        Program8_ATOFPrintCityName obj = new Program8_ATOFPrintCityName();//object created
        obj.city();//instance method called
    }// instance method
    public void city()
    {
        if (J == 'A')  //if else if loop used
        {
            System.out.println("Ahmedabad");
        } else if (J == 'B')
        {
            System.out.println("Bhavnagar");
        } else if (J == 'C')
        {
            System.out.println("Chennai");
        } else if (J == 'D')
        {
            System.out.println("Delhi");
        } else if (J == 'E')
        {
            System.out.println("Encap");
        } else if (J == 'F')
        {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Character Entered");
        }
    }
}
