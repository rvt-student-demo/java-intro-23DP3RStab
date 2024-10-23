package lv.rvt;

import java.util.ArrayList;     
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(s.nextLine());

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        try {
            System.out.print("From where? ");
            int beginning = Integer.valueOf(s.nextLine());
            System.out.print("To where? ");
            int end = Integer.valueOf(s.nextLine());
            
            for(int index = beginning; index <= end; index++) {
                System.out.println(numbers.get(index));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a valid index.");
        } finally {
            s.close();
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
