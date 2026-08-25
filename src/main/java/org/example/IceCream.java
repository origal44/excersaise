package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class IceCream {
    static void main() {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose a amount of balls");
        int balls = scanner.nextInt();
        int answer = -1;
        if (balls > 5) {
            System.out.println("you need a diet you fat nigero");
            System.exit(0);
        }

        System.out.println("which of the following flavros would you like ");

        for(Flavors flavor : Flavors.values()) {
            System.out.print(flavor + " " + flavor.GetCode() + " ");
        }

        answer = scanner.nextInt();
        int count = balls - 1;
        int flag = 0;
        if (answer > 4 || answer < 0) {
            System.out.println("pls enter an actuall flavor");
            ++count;
            flag = 1;
        }

        if (flag == 0) {
            int var10002 = array[answer]++;
        }

        while(count != 0) {
            System.out.println("enter a flavor");
            answer = scanner.nextInt();
             array[answer]++;
            --count;
        }

        for(int i = 0; i < balls; ++i) {
            System.out.println(array[i]);
        }

    }
}
