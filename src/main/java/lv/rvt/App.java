package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("");

        divisableByThreeInRange(begin, end);

        scanner.close();
    }

    public static void printText(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    public static void divisableByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
