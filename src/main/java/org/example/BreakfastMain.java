package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BreakfastMain {
    public static  void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];


        for (int i = 0; i < people.length; i++) {
            System.out.println("person " + (i + 1));
            int[] quantities = new int[Breakfast.values().length];

            for (Breakfast item : Breakfast.values()) {
                System.out.println("how many " + item + " would you like");
                quantities[item.getCode()] = scanner.nextInt();
            }

            people[i] = new Person(quantities);
        }
        people[0].getQuantities();

        Arrays.sort(people, Comparator.comparingInt(Person::getTotal).reversed());

        for(int i = 0; i < people.length; i++)
        {
            System.out.println("person" + (people[i].getId()) + " " +  people[i].getTotal());
        }



        }

    }

