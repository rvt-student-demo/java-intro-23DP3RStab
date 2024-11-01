package lv.rvt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String[]> dati = new ArrayList<>();
        
        while (true) {
            String input = s.nextLine();

            if (input.isEmpty()) {
                break;
            }

            dati.add(input.split(","));

        }

        String longestString = "";
        int summa = 0;
        int count = 0;

        for (String[] data : dati) {   
            if (data.length > 0 && data[0].length() > longestString.length()) {
                longestString = data[0];
            }
        }

        for (String[] data : dati) {
            for (int i = 0; i < dati.size(); i++) {
                summa += Integer.parseInt(data[1]);
                count++;
            }
        }

        System.out.println("Longest name: " + longestString);
        System.out.println("Average of the birth years: " + 1.0 * summa / count);

        s.close();

    }

    public static void divisableByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static int[] bubbleSort(int[] intArr) {
        int length = intArr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        for (int skaitlis : intArr) {
            System.out.print(skaitlis + " ");
        }

        return intArr;
    }

}
