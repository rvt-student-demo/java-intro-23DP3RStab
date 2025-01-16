package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App    
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Original Box:");
        System.out.println("Volume: " + box.volume());
        System.out.println("Area: " + box.area());

        Box biggerBox = box.biggerBox(box);
        System.out.println("\nBigger Box:");
        System.out.println("Volume: " + biggerBox.volume());
        System.out.println("Area: " + biggerBox.area());

        Box smallerBox = box.smallerBox(box);
        System.out.println("\nSmaller Box:");
        System.out.println("Volume: " + smallerBox.volume());
        System.out.println("Area: " + smallerBox.area());

        System.out.println("\nDoes the original box nest inside the bigger box? " + box.nests(biggerBox));
        System.out.println("Does the smaller box nest inside the original box? " + smallerBox.nests(box));
        System.out.println("Does the bigger box nest inside the original box? " + biggerBox.nests(box));



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