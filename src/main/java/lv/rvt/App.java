package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

import lv.rvt.tools.Helper;

public class App    
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = Helper.getReader("persons.csv");
        // reader.readLine();
        // System.out.println(reader.readLine());
        // System.out.println(reader.readLine());

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("Visas rindas ir izlasitas!");
    }

    public static void divisableByThreeInRange(int beginning, int end)
    {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
    {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static int[] bubbleSort(int[] intArr)
    {
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

    public static void printPersons(ArrayList<Person> persons)
    {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}