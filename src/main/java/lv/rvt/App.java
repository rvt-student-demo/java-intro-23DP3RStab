package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");

        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120)
        {
            System.out.println("Speeding ticket!");
        }
        else
        {
            System.out.println("Speed is normal");
        }



        scanner.close();
    }

}
