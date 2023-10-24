package homework_week3;
import java.time.Year;
import java.util.Scanner;
/**
 * . Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
public class Program4_NumberOfDaysInMonth {
    static int month;
    static int year;
    public static void main(String[] args)
    {// main method
        Scanner scan = new Scanner(System.in);//scanner used
        System.out.println("Please Insert Year: ");
        int year = scan.nextInt();
        if (year >= 1 && year <= 9999)//if else used
        {
            isLeapYear(year);
            getDaysInMonth(month, year);
        } else
        {
            System.out.println("False");
        }
        scan.close();//scanner close
    }
    public static void isLeapYear(int year)// static method
    {
        if (year != 0) //if else if used
        {
            if (year % 400 == 0)
                System.out.println("True");
            else if (year % 100 == 0)
                System.out.println("True");
            else if (year % 4 == 0)
                System.out.println("True");
            else
                System.out.println("False");
        } else
            System.out.println("False");
    }
    public static void getDaysInMonth(int month, int year)// static method
    {
        Scanner input = new Scanner(System.in);//scanner used
        int days = 0;
        System.out.println("Please insert Month: ");
        month = input.nextInt();
        switch (month)
        {
            case 1:
                days = 31;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else
                {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
            default:
                days = -1;
        }
        System.out.println(days);
        input.close();//scanner close
    }

}