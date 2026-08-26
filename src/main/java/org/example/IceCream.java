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

        System.out.println("this is our options:");

        for(Flavors flavor : Flavors.values()) {
            System.out.print(flavor + " " + flavor.GetCode() + " ");
        }


        int count = balls;

        while(count != 0) {
            System.out.println(" please enter a flavor");
            answer = scanner.nextInt();
            if(answer<5 && answer>=0)
            {
                array[answer]++;
                count--;
            }
            else{
                System.out.println("Error this flavor doesnt exist ");
            }

        }
        int max=-0;
        int done=0;
        int index =0;

        Flavors[] tam = {Flavors.chocolate,Flavors.vanilla,Flavors.oreos,Flavors.ferro,Flavors.strawberry};

        while(done<array.length)
        {
            for(int i =0; i<array.length;i++)
            {
                if(array[i] ==0 )
                {
                    done++;
                }
                if(max<array[i])
                {
                    max= array[i];
                    index =i;
                }
            }
            System.out.println("you chose " + max + " " + tam[index]);
            max =0;
            array[index] = 0;

        }





    }
}
