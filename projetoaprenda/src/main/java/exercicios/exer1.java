package exercicios;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        // Gross Pay Calculator - esse deveria ser nome da class que sempre inicia com a
        // primeira letra maiuscula
        // 1. Get the number of hours worked
        System.out.println("Enter the number of hours employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        // 2. Get the hourly pay rate
        System.out.println("Enter the hourly pay rate: ");
        double payRate = scanner.nextDouble();

        // 3. Multiply hours pay rate
        double grossPay = hoursWorked * payRate;

        // 4. Display result

        System.out.println("The employe's gross pay total is: $" + grossPay);
    }

}