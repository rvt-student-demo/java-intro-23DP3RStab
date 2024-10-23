package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner numbers = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("ievadi ciparus atdalot ar ,");
        String input = numbers.nextLine();
        String[] parts = input.split(",");

        for (String part : parts) {
            numberList.add(Integer.parseInt(part.trim()));
        }
        int sum = 0;
        for (Integer i : numberList) {
            sum += i;
        }
        System.out.println(numberList);
        System.out.println("Summa: " + sum);

        numbers.close();
    }

    public static void divisableByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
