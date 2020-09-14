/*
 * 1. Retreive value from array
 * 0,0,550,275,1100,550,1650,825,2200,1100,2750,1375,3300,1650,3850,1925,4400,2200,....
 * Input : N = 10
 * Output: 1100
 */

import java.util.Scanner;

public class ArrIndex {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 550, 275, 1100, 550, 1650, 825, 2200, 1100, 2750, 1375, 3300, 1650, 3850, 1925, 4400,
                2200 };
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        while (choice >= 0) {
            System.out.print("Enter choice (negative number to exit) : ");
            choice = scan.nextInt();
            if (choice >= 0 && choice < arr.length)
                System.out.println(arr[choice - 1]);
            else
                System.out.println("Invalid choice");
        }
        scan.close();

    }
}
