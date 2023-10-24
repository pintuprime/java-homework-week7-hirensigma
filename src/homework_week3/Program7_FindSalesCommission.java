package homework_week3;

import java.util.Scanner;

public class Program7_FindSalesCommission {
    int sales_id;
    String name;
    int sales_amount;
    int Basic_salary;
    double commission;
    public void cal() {
        if (sales_amount >= 50000) {
            commission = (sales_amount * 35) / 100;
        } else if (sales_amount >= 30000) {
            commission = (sales_amount * 20) / 100;
        } else if (sales_amount >= 20000) {
            commission = (sales_amount * 10) / 100;
        } else if (sales_amount >= 10000) {
            commission = (sales_amount * 5) / 100;
        } else {
            commission = (sales_amount * 2) / 100;
        }
        System.out.println("The Commission based on entered value is : " + commission);
    }

    public void display() {
        System.out.println("Sales :" + sales_id);
        System.out.println("Seller name :" + name);
        System.out.println("Total amount: " + sales_amount);
        System.out.println("salary: " + Basic_salary);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales id: ");
        sales_id = scanner.nextInt();
        System.out.println("Enter Seller Name : ");
        name = scanner.next();
        System.out.println("Enter Sales amount : ");
        sales_amount = scanner.nextInt();
        System.out.println(" Enter salary basic :");
        Basic_salary = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        Program7_FindSalesCommission obj = new Program7_FindSalesCommission();
        obj.input();
        obj.cal();
        obj.display();

    }

}



