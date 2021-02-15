package forandwhileloops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range (Lower value and Upper value) of the Consective Numbers that you want to add: ");
        int j = input.nextInt();
        int n = input.nextInt();

        int sum = 0;

        for (i = j; i <= n; i++) {
            sum = sum + i;

            System.out.println("Sum of " + j + " to " + i + " Numbers = " + sum);

        }
        // System.out.println("Sum of " + j + " to " + n + " Numbers = " + sum);
    }

}
