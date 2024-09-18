package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli: ");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet otro skaitli: ");
        int number2 = Integer.valueOf(scanner.nextLine());

        // Izvada divu skaitļu summu
        int sum = number1 + number2;
        // Izvada divu skaitļu reizinājumu
        int multi = number1 * number2;
        // Izvada divu skaitļu dalījumu
        double div = (double) number1 / number2;
        // Izvada divu skaitlu starpību
        int sub = number1 - number2;
        // Izvada divu skaitļu vidējo vērtību
        double avg = (double) (number1 + number2) / 2;

        // Izvada rezultātus
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + sub);
        System.out.println(number1 + " * " + number2 + " = " + multi);
        System.out.println(number1 + " / " + number2 + " = " + div);
        System.out.println("Videja vertiba: " + avg);

        scanner.close();
    }

}
