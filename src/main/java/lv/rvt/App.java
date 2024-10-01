package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n+1; i++) {
            System.out.println(i);
        }

        scanner.close();
    }

}
