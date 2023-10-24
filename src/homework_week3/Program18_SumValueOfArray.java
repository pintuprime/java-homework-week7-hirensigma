package homework_week3;
//Write a Java program to sum values of an array.
public class Program18_SumValueOfArray {
    public static void main(String[] args) {//main method
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
