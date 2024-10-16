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
        age1 = scanner.nextInt();

        System.out.println("Data of second person: ");
        System.out.printf("Name: ");
        person2 = scanner.nextLine();
        System.out.printf("Age: ");
        age2 = scanner.nextInt();

        media = (age1 + age2) / 2;

        System.out.println("The media age of " + person1 + " and " + person2 + " is " + media);

        System.out.println("------------------------------------------------------");

        // exercise 9 | sum

        System.out.println("Type the value of l: ");
        int l = scanner.nextInt();

        System.out.println("Type the value of p: ");
        int p = scanner.nextInt();

        int summ = l + p;

        System.out.println("The sum of numbers is " + summ);

        System.out.println("------------------------------------------------------");

        // exercise 10 | change for money
        double troco = 0;

        System.out.println("Preço unitario do produto: ");
        double  precoUni = scanner.nextDouble();

        System.out.println("Quantidade comprada: ");
        double  qntd = scanner.nextDouble();

        System.out.println("Dinheiro recebido: ");
        double  dinRece = scanner.nextDouble();

        troco = dinRece - (qntd * precoUni);

        System.out.println("TROCO: R$" + troco);

        System.out.println("------------------------------------------------------");

        // exercise 11 | circle

        double r, areaCircle;

        System.out.println("Digite o valor do raio: ");
        r = scanner.nextDouble();

        areaCircle = Math.PI * Math.pow(r , 2);

        System.out.printf("Area: %.3f\n ", areaCircle);

        System.out.println("------------------------------------------------------");

        // exercise 12 | payment

        String name;
        int value, hours, pay;

        System.out.println("Name: ");
        name = scanner.nextLine();

        System.out.printf("value per hour: ");
        value = scanner.nextInt();

        System.out.printf("Hours worked : ");
        hours = scanner.nextInt();

        pay = value * hours;


        System.out.println("The payment to " + name + " should be $" + pay );

        System.out.println("------------------------------------------------------");

        // exercise 13 | consumption

        int distance;
        double fuel, consumeM;

        System.out.println("Distance traveled: ");
        distance = scanner.nextInt();

        System.out.println("Spent fuel: ");
        fuel = scanner.nextDouble();

        consumeM = distance / fuel;

        System.out.printf("Average consumption: %.3f", consumeM);

        System.out.println("------------------------------------------------------");

        // exercise 14 | medidas |
        //a) a área do quadrado que tem lado A
        //b) a área do triângulo retângulo que tem base A e altura B
        //c) a área do trapézio que tem bases A e B, e altura C

        double medidaA, medidaB, medidaC, areaTriangulo, areaQuadrado, areaTrapezio;

        System.out.println("Digite a medida A: ");
        medidaA = scanner.nextDouble();

        System.out.println("Digite a medida B: ");
        medidaB = scanner.nextDouble();

        System.out.println("Digite a medida C: ");
        medidaC = scanner.nextDouble();

        areaQuadrado = medidaA * medidaA;
        areaTriangulo = (medidaA * medidaB) / 2;
        areaTrapezio = ((medidaA + medidaB) * medidaC) / 2;

        System.out.printf("ÁREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("ÁREA DO TRIANGULO = %.4f%n", areaTriangulo);
        System.out.printf("ÁREA DO TRAPÉZIO = %.4f%n", areaTrapezio);
    }
}