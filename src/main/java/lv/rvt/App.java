package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give me a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input != 0) {
                sum = sum + input;
                count = count + 1;
                continue;
            } else {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }


        scanner.close();
    }

}
