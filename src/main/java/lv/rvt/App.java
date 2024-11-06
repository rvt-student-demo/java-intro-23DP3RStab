package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);

        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        matthewsAccount.withdraw(100);
        myAccount.deposit(100);

        System.out.println(matthewsAccount);
        System.out.println("-----------------------------");
        System.out.println(myAccount);

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