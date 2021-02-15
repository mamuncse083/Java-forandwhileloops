package forandwhileloops;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        int i;
        double n = 1.609;

        for (i = 1; i <= 10; i++) {
            n = i * n;
            System.out.println(i + " mile is " + n + " kilometers");

        }
        // System.out.println("Sum of " + j + " to " + n + " Numbers = " + sum);
    }

}
