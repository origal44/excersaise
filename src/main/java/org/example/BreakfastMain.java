package org.example;

import java.util.Scanner;

public class BreakfastMain {
    public static  void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Person[] people = {new Person(),new Person(),new Person(),new Person(),new Person()} ;
        int j;
        int count;
        for(int i =0; i< people.length; i++)
        {
            System.out.println("person " + (i+1));
            j=0;
            System.out.println("how many panckes would you like");
            count = scanner.nextInt();
            people[i].amount[j][1] = count;
            j++;

            System.out.println("how many toasts would you like");
            count = scanner.nextInt();
            people[i].amount[j][1] = count;
            j++;

            System.out.println("how many omelet would you like");
            count = scanner.nextInt();
            people[i].amount[j][1] = count;


        }
        int Pprice = 54;
        int Tprice = 60;
        int Oprice = 39;
        int sum =0;

        int[] arraysum = new int[5];
        for(int i=0; i<5; i++)
        {
            j =0;
           arraysum[i] += people[i].amount[j][1] * Pprice;
           j++;
            arraysum[i] += people[i].amount[j][1] * Tprice;
            j++;
            arraysum[i] += people[i].amount[j][1] * Oprice;

        }
        int max =0;
        int done =0;
        int index =0;
        while (done<5){
            for(int i =0; i<5; i++)
            {
                if(arraysum[i] ==0)
                {
                    done++;
                }
                if(arraysum[i]>max)
                {
                    max = arraysum[i];
                    index =i;
                }


            }
            System.out.println("person " + (index+1) + " your total is " + max);
            arraysum[index] =0;

        }

    }
}
