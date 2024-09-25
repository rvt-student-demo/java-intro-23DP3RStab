package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int cena = Integer.valueOf(scanner.nextLine());

        double tax;

        if (cena >= 1000000) {
            tax = 142100 + 0.17 * (cena - 1000000);
            System.out.println("Tax: " + tax);
        } else if (cena >= 200000) {
            tax = 22100 + 0.15 * (cena - 200000);
            System.out.println("Tax: " + tax);
        } else if (cena >= 55000) {
            tax = 4700 + 0.12 * (cena - 55000);
            System.out.println("Tax: " + tax);
        } else if (cena >= 25000) {
            tax = 1700 + 0.1 * (cena - 25000);
            System.out.println("Tax: " + tax);
        } else if (cena >= 5000) {
            tax = 100 + 0.08 * (cena - 5000);
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }


        scanner.close();
    }

}
