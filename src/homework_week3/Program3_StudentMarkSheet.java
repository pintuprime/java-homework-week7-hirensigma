package homework_week3;
/*
. Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */
import java.util.Scanner;
public class Program3_StudentMarkSheet {
    static String name;//static variable
    static int roll,maths,sci,eng;//static variable
    static int total;//static variable
    static double percentage;//static variable
    static String Grade;//static variable
    static String result;//static variable

    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner used
        System.out.println("Please enter Student Name: ");
        name = scan.nextLine();
        System.out.println("Please enter Student Roll Number");
        roll = scan.nextInt();
        System.out.println("Please enter Maths marks: ");
        maths = scan.nextInt();
        System.out.println("Please enter Science marks :");
        sci = scan.nextInt();
        System.out.println("Please enter English marks :");
        eng = scan.nextInt();
        if(maths >= 0 && maths <= 100&& sci >= 0 && sci <= 100 && eng >= 0 && eng <= 100)
        {
            result();
            print();
        }else {
            System.out.println("The marks value should be between 0 to 100");
        }
        scan.close();//scanner closed
    }
    public static void result(){//static method
        total = maths + eng + sci;
        percentage = (total / 3);
        if ((maths < 35) || (sci < 35) || (eng < 35))//if else if used
        {
            percentage = 0.0;
            result = "Fail";
            Grade = "N/A";
        }else if ((percentage >= 35) && percentage < 50)
        {
            result = "Pass";
            Grade = "C";
        } else if ((percentage >= 50) && percentage <60)
        {
         result = "Pass";
         Grade = "B";
        } else if ((percentage >= 60) && percentage < 80)
        {
            result = "Pass";
            Grade = "A";
        } else if (percentage >= 80) {
            result = "Pass";
            Grade = "A++";
        }
    }
    public static void print(){//static method
        System.out.println("------------------------------------------------------------");
        System.out.println("|                         MARK SHEET                        ");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    Name     :      " +   name  +  "                                  |");
        System.out.println("|    Roll No#.:      " +   roll  +  "                                  |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    SUBJECTS                     :        MARKS           |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    Maths                        :        " + maths + "              |");
        System.out.println("|    Science                      :        " + sci + "              |");
        System.out.println("|    English                      :        " + eng + "              |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    Total                        :        " + total + "             |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    Percentage                   :        " + percentage + "            |");
        System.out.println("|    Result                       :        " + result + "            |");
        System.out.println("|    Grade                        :        " + Grade + "             |");
        System.out.println("|----------------------------------------------------------|");
    }
}
