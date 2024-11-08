package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);

        DecreasingCounter counter1 = new DecreasingCounter(10);

        counter1.printValue();

        counter1.decrement();
        counter1.printValue();

        counter1.decrement();
        counter1.printValue();

        
        System.out.println();


        DecreasingCounter counter2 = new DecreasingCounter(2);

        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();


        System.out.println();


        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.decrement();
        counter3.printValue();

        s.close();

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
}