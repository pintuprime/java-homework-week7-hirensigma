package homework_week3;
import java.time.Year;
import java.util.Scanner;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2_FindLeapYear
{
    static int year;//static variable
    boolean isLeap = false;//instance variable
    //instance method
    public void abc()
    {
        if (year % 4 == 0)
        {//if else if loop used
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else
        {
            isLeap = false;
        }
        if (isLeap == true)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year");
    }
//main method (instance method called in main method by object creation)
    public static void main(String[] args)
    {
        Program2_FindLeapYear obj = new Program2_FindLeapYear();//object created
        Scanner s = new Scanner(System.in);//scanner used
        System.out.println("Enter a Year");
        year = s.nextInt();
        obj.abc();//instance method called by object
        s.close();//scanner closed
    }
}
