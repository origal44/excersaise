import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose a drink from the following");
        System.out.println("cola-1,colaZero-2,Sprite-3,fanta-4,fuzetea-5");
        int code = scanner.nextInt();

        while(code>5 || code<1){
            System.out.println("pls enter a valid number");
             code = scanner.nextInt();

        }

            Drinks var = Drinks.fromCode(code);

            System.out.println("you chose : " + var);


        }
    }
