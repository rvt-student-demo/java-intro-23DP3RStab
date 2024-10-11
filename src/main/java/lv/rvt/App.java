package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        Stars.printStars(5);
        Stars.printStars(3);
        Stars.printStars(9);

        Stars.printSquare(4);

        Stars.printRectangle(17, 3);
        
        Stars.printTriangle(4);

        scanner.close();
    }

    public static void divisableByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
