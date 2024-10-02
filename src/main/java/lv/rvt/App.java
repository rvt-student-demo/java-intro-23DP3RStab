package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");

        int n = Integer.valueOf(scanner.nextLine());
        
        printText(n);

        scanner.close();
    }

    public static void printText(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }

}
