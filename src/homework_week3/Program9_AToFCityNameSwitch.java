package homework_week3;
import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly by switch statments
public class Program9_AToFCityNameSwitch
{
    static char N;// static variablr
    public static void main(String[] args)//main method
    {
        Scanner scan = new Scanner(System.in);//scanner used
        System.out.println("Enter character from A to F (Uppercase only) : ");
        N = scan.next().charAt(0);
        scan.close();//scanner closed
        cities();//static method called directly
    }
    public static void cities() //static method
    {
        switch (N)//switch statment used
        {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bhavnagar");
                break;
            case 'C':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Encap");
                break;
            case 'F':
                System.out.println("Faridabad");
            default: {
                System.out.println(" Invalid Entry");
            }

        }
    }
}
