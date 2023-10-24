package homework_week3;
import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array.
public class Program17_SortNumeric_StringArray {
    public static void main(String[] args) {// main method
        int[] my_arrays1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_arrays2 = {
                "Java",
                "Phyton",
                "Php",
                "C#",
                "C Programming",
                "C++"};
        System.out.println("Original numeric array : " + Arrays.toString(my_arrays1));
        Arrays.sort(my_arrays1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_arrays1));
        System.out.println("Original string array : " + Arrays.toString(my_arrays2));
        Arrays.sort(my_arrays2);
        System.out.println("Sorted string arrays : " + Arrays.toString(my_arrays2));
    }
}

