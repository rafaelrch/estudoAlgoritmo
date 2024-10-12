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
        System.out.println("Product:");
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
        System.out.println("-------------------------------------------");

        /* Example 6 | Make a program to read the measurements of the width and length of a rectangular plot of land
        to one decimal place, as well as the value of the square meter of the plot to two decimal places.
        decimal place, as well as the value of the square meter of the plot to two decimal places. Then
        the program should display the value of the area of the plot, as well as the value of the price of the plot,
        both to two decimal places.*/

        int widthT, lengthT, priceM, areaT, priceT;

        System.out.println("Enter the width of the land ");
        widthT = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the length of the land: ");
        lengthT = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the value per square meter: ");
        priceM = Integer.parseInt(scanner.nextLine());

        areaT = widthT * lengthT;
        priceT = priceM * areaT;

        System.out.println("The area of the land is " + areaT);
        System.out.println("The value of the land is " + priceT);

        System.out.println("--------------------------------------------------");

        /* Example 7 | Make a program to read the measures of the base and height of a rectangle. Then display the
of the area, perimeter and diagonal of this rectangle, to four decimal places*/

        double baseR, heightR, areaR, perimeterR, diagonalR;

        System.out.println("Enter the base of rectangle: ");
        baseR = scanner.nextDouble();

        System.out.println("Enter the height of rectangle: ");
        heightR = scanner.nextDouble();

        areaR = baseR * heightR;
        perimeterR = 2 * (baseR + heightR);
        diagonalR = Math.sqrt(Math.pow(baseR, 2) + Math.pow(heightR, 2));

        System.out.printf("The area of rectangle is: %.4f\n", areaR);
        System.out.printf("The perimeter of rectangle is: %.4f\n", perimeterR);
        System.out.printf("The diagonal of rectangle is: %.4f\n", diagonalR);

        System.out.println("--------------------------------------------------");

        //Example 8

        String person1, person2, person3;
        int age1, age2;
        double media;

        System.out.println("Data of first person: ");
        System.out.printf("Name: ");

        person1 = scanner.nextLine();
        System.out.printf("Age: ");
        age1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Data of second person: ");
        System.out.printf("Name: ");
        person2 = scanner.nextLine();
        System.out.printf("Age: ");
        age2 = Integer.parseInt(scanner.nextLine());

        media = (age1 + age2) / 2;

        System.out.printf("The media age de " + person1 + " and " + person2 + " is " + media);
    }
}