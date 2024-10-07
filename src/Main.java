//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Example 1

        String produto1 = "Computador";
        String produto2 = "TV";
        double preco1 = 2100.5;
        double preco2 = 1830.0;
        int idade = 30;
        int codigo = 5291;
        String genero = "F";

        System.out.println("-----------------------------------------");
        System.out.println("Produtc:");
        System.out.println("O produto " + produto1 + " custa R$ " + preco1);
        System.out.println("O produto " + produto2 +  " custa R$ " + preco2);
        System.out.println(" ");
        System.out.println("Código = " + codigo);
        System.out.println(" ");
        System.out.println("Dados da pessoa: gênero " + genero + " e idade " + idade);
        System.out.println("--------------------------------------------------");


        // Example 2
       double b, B, h, area;

       b = 6.0;
       B = 8.0;
       h = 5.0;

       area = (b + B) / 2.0 * h;

       System.out.println("The area of this example is " + area);

       System.out.println("-----------------------------------------");

       //Example 3

        double a = 5.10;
        int b2 = (int) a;


        System.out.println(b);
        System.out.println("--------------------------------------");

        //Example 4 | Write a program that asks the user for two numbers and displays their sum

        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second number: ");
        num2 = Integer.parseInt(scanner.nextLine());

        sum = num1 + num2;

        System.out.println("The sum of the numbers is: " + sum);

        System.out.println("-------------------------------------------");

        //Example 5 | Write a program that asks the user for five numbers and displays which one is bigger.

        int[] n = new int[5];

        for(int i = 0; i < 5; i++) {

            System.out.println("Type the number " + (i + 1) + " : ");
            n[i] = Integer.parseInt(scanner.nextLine());

        }

        int max = n[0];

        for(int i = 0; i < 5; i++){
            if(n[i] > max) {
                max = n[i];
            }
        }

        System.out.println("The number max is: " + max);

    }
}