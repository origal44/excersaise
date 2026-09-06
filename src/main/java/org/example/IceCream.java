package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCream {

    public static void displayOptions() {
        System.out.println("this is our options:");

        for(Flavors flavor : Flavors.values()) {
            System.out.print(flavor + " " + flavor.getCode() + " ");
        }

    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose a amount of balls");
        int balls = scanner.nextInt();
        int answer = -1;
        if (balls > 5) {
            System.out.println("5 balls MAX");
            System.exit(0);
        }

        displayOptions();


        int count = balls;
        Map<Flavors,Integer> tastes = new HashMap<>();
        while(count != 0) {
            System.out.println(" please enter a flavor");
            answer = scanner.nextInt();

            Flavors chosen = Flavors.fromCode(answer);
            if (chosen != null) {
                tastes.put(chosen, tastes.getOrDefault(chosen, 0) + 1);
                count--;
            } else {
                System.out.println("Error this flavor doesnt exist ");
            }

        }
        tastes.entrySet().stream()
                .sorted(Map.Entry.<Flavors, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));


    }
}
