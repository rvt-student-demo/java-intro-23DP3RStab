package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // // Make your first Hello World app!
        // System.out.println("Hello World!");

        // // Reference data type
        // String name = "John";

        // // Primitive data types
        // int age = 25;

        // // Primitive data types
        // boolean isOnline = true;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(isOnline);



        // System.out.println("Ievadi tekstu:");

        // String message = scanner.nextLine();

        // // String concatenation
        // System.out.println("Input: " + message);

        System.out.println("Ievadiet savu vardu:");
        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvardu:");
        String lastname = scanner.nextLine();

        System.out.println("Ievadiet savu grupu:");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", grupa: " + group);
    }

}
