package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int nums = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + nums);
                System.out.println("Average: " + (double)sum / nums);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += input;
            nums++;
            
        }

        scanner.close();
    }

}
