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
  System.out.println("O produto " + produto2 + " custa R$ " + preco2);
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

  for (int i = 0; i < 5; i++) {

   System.out.println("Type the number " + (i + 1) + " : ");
   n[i] = Integer.parseInt(scanner.nextLine());

  }

  int max = n[0];

  for (int i = 0; i < 5; i++) {
   if (n[i] > max) {
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
  double precoUni = scanner.nextDouble();

  System.out.println("Quantidade comprada: ");
  double qntd = scanner.nextDouble();

  System.out.println("Dinheiro recebido: ");
  double dinRece = scanner.nextDouble();


  troco = dinRece - (qntd * precoUni);

  System.out.println("TROCO: R$" + troco);

  System.out.println("------------------------------------------------------");

  // exercise 11 | circle

  double r, areaCircle;

  System.out.println("Digite o valor do raio: ");
  r = scanner.nextDouble();

  areaCircle = Math.PI * Math.pow(r, 2);

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


  System.out.println("The payment to " + name + " should be $" + pay);

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

  System.out.println("------------------------------------------------------");

  // exercise 15 | Duration

  int duration, hour, minute, second, resto;

  System.out.println("Type the duration in seconds: ");
  duration = scanner.nextInt();

  hour = duration / 3600;
  resto = duration % 3600;
  minute = resto / 60;
  second = resto % 60;

  System.out.println(hour + ":" + minute + ":" + second);

  System.out.println("------------------------------------------------------");

  // exercise 16 | Notas

  double nota1, nota2, notaFinal;


  System.out.println("Digite a primeira nota: ");
  nota1 = scanner.nextDouble();

  System.out.println("Digite a segunda nota: ");
  nota2 = scanner.nextDouble();

  notaFinal = nota1 + nota2;

  if (notaFinal < 60.0) {
   System.out.printf("NOTA FINAL: " + notaFinal);
   System.out.println("REPROVADO");
  } else {
   System.out.println("NOTA FINAL: " + notaFinal);
   System.out.println("APROVADO");
  }

  System.out.println("------------------------------------------------------");

  // exercise 17 | Baskara

  double a1, b1, c1, x1, x2, delta;

  System.out.printf("Coeficiente a: \n");
  a1 = scanner.nextDouble();

  System.out.printf("Coeficiente b: \n");
  b1 = scanner.nextDouble();

  System.out.printf("Coeficiente c: \n");
  c1 = scanner.nextDouble();

  delta = Math.pow(b1, 2) - 4 * a1 * c1;

  if (a1 == 0 || delta < 0) {
   System.out.println("Não possui raizes reais");
  } else {
   x1 = (-b1 + Math.sqrt(delta)) / (2 * a1);
   x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);


   System.out.printf("X1 = %.4f%n", x1);
   System.out.printf("X2 = %.4f%n", x2);
  }

  System.out.println("------------------------------------------------------");

  // exercise 18 | Menor entre tres

  int num01, num02, num03, menor;

  System.out.println("Primeiro valor: ");
  num01 = scanner.nextInt();
  System.out.println("Segundo valor: ");
  num02 = scanner.nextInt();
  System.out.println("Terceiro valor: ");
  num03 = scanner.nextInt();

  if (num01 < num02 && num01 < num03) {
   menor = num01;
   System.out.println("MENOR: " + num01);
  } else if (num02 < num01 && num02 < num03) {
   menor = num02;
   System.out.println("MENOR: " + num02);
  } else {
   menor = num03;
   System.out.println("MENOR: " + num03);
  }

  System.out.println("------------------------------------------------------");

  // exercise 19 | Dia da semana

  int x;
  String dia;

  System.out.println("Dia: ");
  x = scanner.nextInt();

  switch (x) {
   case 1:
    dia = "Segunda-feira";
    break;
   case 2:
    dia = "Terça-feira";
    break;
   case 3:
    dia = "Quarta-feira";
    break;
   case 4:
    dia = "Quinta-feira";
    break;
   case 5:
    dia = "Sexta-feira";
    break;
   case 6:
    dia = "Sábado";
    break;
   case 7:
    dia = "Domingo";
    break;

   default:
    dia = "Valor inválido";
  }

  System.out.println("Dia da semana: " + dia);

  System.out.println("------------------------------------------------------");

  // exercise 20 | Operadora

  int minutos;
  double valorPago;

  System.out.println("Escreva a quantidade de minutos: ");
  minutos = scanner.nextInt();

  valorPago = 50;

  if (minutos > 100) {
   valorPago = (minutos - 100) * 2 + valorPago;
  }

  System.out.printf("Valor a pagar: R$ %.2f\n", valorPago);

  System.out.println("------------------------------------------------------");

  // exercise 21 | Troco verificada

  double precoProduto, dinheiroRecebido, trocoDinheiro, falta;
  int quantidade;

  trocoDinheiro = 0;

  System.out.println("Preço unitario do produto: ");
  precoProduto = scanner.nextDouble();

  System.out.println("Quantidade do produto: ");
  quantidade = scanner.nextInt();

  System.out.println("Dinheiro recebido: ");
  dinheiroRecebido = scanner.nextDouble();

  if (dinheiroRecebido < (precoProduto * quantidade)) {
   falta = (precoProduto * quantidade) - dinheiroRecebido;
   System.out.printf("FALTAM R$%.2f REAIS\n", falta);
  } else {
   trocoDinheiro = quantidade - (precoProduto * quantidade);
   System.out.printf("TROCO: R$%.2f\n", trocoDinheiro);
  }

  System.out.println("------------------------------------------------------");

  // exercise 22 | Glicose

  double medida;
  System.out.println("Digite a medida da glicose: ");
  medida = scanner.nextDouble();

  if (medida <= 100) {
   System.out.println("Classificação: Normal ");
  } else if (medida > 100 && medida <= 140) {
   System.out.println("Clasificação: Elevado");
  } else {
   System.out.println("Diabetes");
  }

  System.out.println("------------------------------------------------------");

  // exercise 23 | Dardo

  double distancia1, distancia2, distancia3, maiorDistancia;
  maiorDistancia = 0;

  System.out.println("Digite as três distâncias: ");
  distancia1 = scanner.nextDouble();
  distancia2 = scanner.nextDouble();
  distancia3 = scanner.nextDouble();

  if (distancia1 > distancia2 && distancia1 > distancia3) {
   maiorDistancia = distancia1;
  } else if (distancia2 > distancia3) {
   maiorDistancia = distancia2;
  } else {
   maiorDistancia = distancia3;
  }

  System.out.printf("MAIOR DISTANCIA: %.2f\n", maiorDistancia);

  System.out.println("------------------------------------------------------");

  // exercise 24 | Temperatura

  String temp;
  double f, c;

  System.out.println("Temperatura em qual escala (C/F): ");
  temp = scanner.nextLine();

  if (temp.equals("F")) {
   System.out.println("Digite a temperatura em Fahrenheit: ");
   f = scanner.nextDouble();
   c = 5.0 / 9.0 * (f - 32);
   System.out.printf("Temperatura equivalente em Celsius: %.2f", c);
  } else {
   System.out.println("Digite a temperatura em Celsius: ");
   c = scanner.nextDouble();
   f = 9.0 * c / 5.0 + 32;
   System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", f);
  }

  System.out.println("------------------------------------------------------");

  // exercise 25 | Lanchonete

  int codigo1, qntdComprada1;
  double valorPagar1, precoProduto1;

  valorPagar1 = 0.00;
  precoProduto1 = 0.00;

  System.out.println("Codigo do produto: ");
  codigo1 = scanner.nextInt();

  System.out.println("Quantidade comprada: ");
  qntdComprada1 = scanner.nextInt();

  switch (codigo1) {
   case 1:
    precoProduto1 = 5.00;
    valorPagar1 = precoProduto1 * qntdComprada1;
    break;
   case 2:
    precoProduto1 = 3.50;
    valorPagar1 = precoProduto1 * qntdComprada1;
    break;
   case 3:
    precoProduto1 = 4.80;
    valorPagar1 = precoProduto1 * qntdComprada1;
    break;
   case 4:
    precoProduto1 = 8.90;
    valorPagar1 = precoProduto1 * qntdComprada1;
    break;
   case 5:
    precoProduto1 = 7.32;
    valorPagar1 = precoProduto1 * qntdComprada1;
    break;
   default:
    System.out.println("Código de produto inválido.");
    return;
  }

  System.out.printf("Valor a pagar: %.2f\n", valorPagar1);

  System.out.println("------------------------------------------------------");

  // exercise 26 | Múltiplos

  int numero1, numero2;
  System.out.println("Digite dois números inteiro:");
  numero1 = scanner.nextInt();
  numero2 = scanner.nextInt();

  if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
   System.out.println("São múltiplos");
  } else {
   System.out.println("Não sao múltiplos");
  }


  System.out.println("------------------------------------------------------");

  // exercise 27 | Aumento salarial

  double salario, novoSalario, aumento;

  System.out.println("Digite o salário da pessoa:");
  salario = scanner.nextDouble();

  if (salario <= 1000) {

   aumento = (salario * 20) / 100;
   novoSalario = aumento + salario;

   System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
   System.out.printf("Aumento: R$ %.2f\n", aumento);
   System.out.println("Porcentagem: 20%");
  } else if (salario > 1000 && salario <= 3000) {

   aumento = (salario * 15) / 100;
   novoSalario = aumento + salario;

   System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
   System.out.printf("Aumento: R$ %.2f\n", aumento);
   System.out.println("Porcentagem: 15%");
  } else if (salario > 3000 && salario <= 8000) {

   aumento = (salario * 10) / 100;
   novoSalario = aumento + salario;

   System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
   System.out.printf("Aumento: R$ %.2f\n", aumento);
   System.out.println("Porcentagem: 10%");
  } else {

   aumento = (salario * 5) / 100;
   novoSalario = aumento + salario;

   System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
   System.out.printf("Aumento: R$ %.2f\n", aumento);
   System.out.printf("Porcentagem: 5%\n");
  }

  System.out.println("------------------------------------------------------");

  // exercise 28 | Hora inicial e final

  int horaInicial, horaFinal, duracaoHoras;

  System.out.printf("Hora inicial: \n");
  horaInicial = scanner.nextInt();
  System.out.printf("Hora final: \n");
  horaFinal = scanner.nextInt();

  duracaoHoras = (24 - horaInicial) + horaFinal;
  System.out.println("O JOGO DUROU " + duracaoHoras + " HORAS");

  System.out.println("------------------------------------------------------");

  // exercise 29 | Coordenadas

  double numeroX, numeroY;

  System.out.println("Valor de X: ");
  numeroX = scanner.nextDouble();
  System.out.println("Valor de Y: ");
  numeroY = scanner.nextDouble();

  if (numeroX > 0 && numeroY > 0) {
   System.out.println("Q1");
  } else if (numeroX < 0 && numeroY > 0) {
   System.out.println("Q2");
  } else if (numeroX < 0 && numeroY < 0) {
   System.out.println("Q3");
  } else if (numeroX > 0 && numeroY < 0) {
   System.out.println("Q4");
  } else if (numeroX == 0 && numeroY == 0) {
   System.out.println("Origem");
  }else if (numeroX == 0) {
   System.out.println("Eixo Y");
  } else {
   System.out.println("Eixo X");
  }

  System.out.println("------------------------------------------------------");

  // exercise 30 | Estrutura repetitiva

  int q,soma;
  System.out.println("Digite o primeiro numero: ");
  q = scanner.nextInt();

  soma = 0;

  while (q != 0){
   soma += q;
   System.out.println("Digite outro numero:");
   q = scanner.nextInt();
  }

  System.out.println("SOMA: " + soma);

  System.out.println("------------------------------------------------------");

  // exercise 31 | Crescente e decrescente

  int q1,w1;

  System.out.println("Digite dois numeros: ");
  q1 = scanner.nextInt();
  w1 = scanner.nextInt();

  while (q1 != w1){
   if (q1 < w1){
    System.out.println("CRESCENTE");
   }else{
    System.out.println("DECRESCENTE");
   }
   System.out.println("Digite outros dois numeros: ");
   q1 = scanner.nextInt();
   w1 = scanner.nextInt();
  }

  System.out.println("------------------------------------------------------");

  // exercise 32 | Media idade

  int idades,somas, cont;
  double mediaIdade;

  cont = 0;
  somas = 0;

  System.out.println("Digite as idades: ");
  idades = scanner.nextInt();

  while (idades > 0){
   cont += 1;
   somas += idades;
   idades = scanner.nextInt();
  }

  if (cont == 0){
   System.out.println("IMPOSSIVEL CALCULAR");
  }else {
   mediaIdade = somas / cont;
   System.out.printf("MEDIA = %.2f\n", mediaIdade);
  }

  System.out.println("------------------------------------------------------");

  // exercise 33 | Senha

  int senha,senhaAcesso;

  System.out.println("Crie uma senha: ");
  senha = scanner.nextInt();

  System.out.println("Digite uma senha para acessar: ");
  senhaAcesso = scanner.nextInt();

  while (senhaAcesso != senha){
   System.out.println("Senha Invalida! Tente novamente:");
   senhaAcesso = scanner.nextInt();
  }

  System.out.println("ACESSO PERMETIDO!");

  System.out.println("------------------------------------------------------");

  // exercise 34 | Validação de nota

  double nota1Aluno, nota2Aluno, mediaAluno;

  System.out.printf("Digite a primeira nota: ");
  nota1Aluno = scanner.nextDouble();

  while (nota1Aluno < 0 || nota1Aluno > 10){
   System.out.printf("Valor inválido! tente novamente: ");
   nota1Aluno = scanner.nextDouble();
  }

  System.out.printf("Digite a segunda nota: ");
  nota2Aluno = scanner.nextDouble();

  while (nota2Aluno < 0 || nota2Aluno > 10){
   System.out.printf("Valor inválido! tente novamente: ");
   nota2Aluno = scanner.nextDouble();
  }

  mediaAluno = (nota1Aluno + nota2Aluno) / 2;
  System.out.println("MEDIA = " + mediaAluno);

  System.out.println("------------------------------------------------------");

  // exercise 35 | Combustivel

  int alcoolPosto, alcoolPostoSoma, gasolinaPosto, gasolinaPostoSoma, diesel, dieselSoma, fim, codigoPosto;
  alcoolPosto = 1;
  gasolinaPosto = 2;
  diesel =3;
  fim = 4;

  alcoolPostoSoma = 0;
  gasolinaPostoSoma = 0;
  dieselSoma = 0;

  System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
  codigoPosto = scanner.nextInt();

  while (codigoPosto != fim){
   System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
   codigoPosto = scanner.nextInt();
   if(codigoPosto > 0 && codigoPosto < 4){
    switch (codigoPosto){
     case 1:
      alcoolPostoSoma += 1;
      break;
     case 2:
      gasolinaPostoSoma += 1;
      break;
     case 3:
      dieselSoma += 1;
      break;
    }
   }


  }

   System.out.println("MUITO OBRIGADO");


  System.out.println("Alcool: " + alcoolPostoSoma);
  System.out.println("Gasolina: " + gasolinaPostoSoma);
  System.out.println("Diesel: " + dieselSoma);


  System.out.println("------------------------------------------------------");

  // exercise 36 | Pares consecutivos

  int somaNumeros, numInteiro;
  somaNumeros = 0;

  System.out.printf("Digite um número inteiro: ");
  numInteiro = scanner.nextInt();

  while(numInteiro != 0){
   if(numInteiro % 2 != 0){
    numInteiro++;
   }

   somaNumeros = 5 * numInteiro + 20;
   System.out.printf("SOMA = %d\n", somaNumeros);

   System.out.printf("Digite um número inteiro: ");
   numInteiro = scanner.nextInt();
  }

  System.out.println("------------------------------------------------------");

  // exercise 37 | Estrutura for  numeros digitados

  int digitado, somaDigitados;
  somaDigitados = 0;

  System.out.printf("Quantos numeros serão digitados: ");
  digitado = scanner.nextInt();

  for (int i = 1; i <= digitado ; i++){
   System.out.printf("Digite um numero: ");
   digitado = scanner.nextInt();
   somaDigitados += digitado;
  }

  System.out.println("SOMA = " + somaDigitados);

  System.out.println("------------------------------------------------------");

  // exercise 38 | Tabuada

  int nTabuada, multiplicacao;

  System.out.printf("Deseja a tabuada para qual valor? ");
  nTabuada = scanner.nextInt();

  for (int i = 1; i <= 10; i++){
   multiplicacao = nTabuada * i;
   System.out.println(nTabuada + " x " + i + " = " + multiplicacao);
  }

  System.out.println("------------------------------------------------------");

  // exercise 39 | soma de impares

  int nuumero1, nuumero2, somasImpares, troca;

  System.out.println("Digite dois numero: ");
  nuumero1 = scanner.nextInt();
  nuumero2 = scanner.nextInt();

  if (nuumero1 > nuumero2){
   troca = nuumero1;
   nuumero1 = nuumero2;
   nuumero2 = troca;
   }

  somasImpares = 0;
  for(int i = nuumero1 + 1; i < nuumero2 ;i++){
   if (i % 2 !=0){
    somasImpares += 1;
   }
  }

  System.out.println("SOMA DOS IMPARES = " + somasImpares);

  System.out.println("------------------------------------------------------");

  // exercise 40 | do-while

  double celsius, faren;
  char repetir;

  do {
   System.out.printf("Digite a temperatura em Celsius: ");
   celsius = scanner.nextDouble();

   faren = (9 * celsius) / 5 + 32;
   System.out.printf("Equivalente em Farenheit: %.1f\n", faren);

   System.out.printf("Deseja repetir (s/n)? ");
   repetir = scanner.next().charAt(0);
  }while (repetir == 's' || repetir == 'S');

  System.out.println("------------------------------------------------------");

  // exercise 41 | Sequencia impares
  int xInteiro;

  System.out.printf("Digite o valor de X: ");
  xInteiro = scanner.nextInt();

  for (int i = 1; i <= xInteiro; i++){
   if (i % 2 != 0){
    System.out.println(i);
   }
  }

  System.out.println("------------------------------------------------------");

  // exercise 42 | Dentro e fora

  int z, s, dentro, fora;
  dentro = 0;
  fora = 0;

  System.out.println("Quantos numeros vc vai digitar? ");
  z = scanner.nextInt();

  for (int i = 1; i <= z; i++){
   System.out.println("Digite um numero: ");
   s = scanner.nextInt();

   if(s >= 10 && s <= 20){
    dentro += 1;
   }else{
    fora += 1;
   }

  }
  System.out.println(dentro + " DENTRO");
  System.out.println(fora + " FORA");

  System.out.println("------------------------------------------------------");

  // exercise 43 | Par e Impar

  int nextNumero, xDigitado;

  System.out.println("Quantos numeros serão digitados: ");
  xDigitado = scanner.nextInt();

  for (int i = 1; i <= xDigitado; i++){
   System.out.printf("Digite um numero: ");
   nextNumero = scanner.nextInt();

   if (nextNumero < 0 && nextNumero % 2 != 0){
    System.out.println("IMPAR NEGATIVO");
   }else if(nextNumero < 0 && nextNumero % 2 == 0){
    System.out.println("PAR NEGATIVO");
   }else if(nextNumero > 0 && nextNumero % 2 != 0){
    System.out.println("IMPAR POSITIVO");
   }else if(nextNumero > 0 && nextNumero % 2 == 0){
    System.out.println("PAR POSITIVO");
   }else{
    System.out.println("NULO");
   }
  }

  System.out.println("------------------------------------------------------");

  // exercise 44 | Media ponderada

  int casosDigitados, peso1, peso2, peso3;
  double mediaPonderada, t1, t2, t3;

  peso1 = 2;
  peso2 = 3;
  peso3 = 5;


  System.out.printf("Quantos casos voce vai digitar? ");
  casosDigitados = scanner.nextInt();

  for(int i = 1; i <= casosDigitados; i++){
   System.out.println("Digite tres numeros ");
   t1 = scanner.nextDouble();
   t2 = scanner.nextDouble();
   t3 = scanner.nextDouble();

   mediaPonderada = (t1 * peso1 + t2 * peso2 + t3 * peso3)  / (peso1 + peso2 + peso3);

   System.out.printf("MEDIA = %.1f%n", mediaPonderada);
  }

  System.out.println("------------------------------------------------------");

  // exercise 45 | Divisão

  int casosDigitados2, numerador, denominador;
  double divisao;

  System.out.printf("Quantos casos vc vai digitar? ");
  casosDigitados2 = scanner.nextInt();

  for (int i = 1; i <= casosDigitados2; i++){
   System.out.println("Digite o numerador: ");
   numerador = scanner.nextInt();
   System.out.println("Digite o denominador: ");
   denominador = scanner.nextInt();

   if(numerador < 0 || numerador < denominador){
    System.out.println("DIVISÃO IMPOSSÍVEL");
   }else {
    divisao = numerador / denominador;

    System.out.println("DIVISÃO = " + divisao);

   }
  }

  System.out.println("------------------------------------------------------");

  // exercise 46 | EXPERIMENTO

  int numeroDeCasos, qntdCobaias, totalCobaias, sapo, rato, coelho;
  double percentualC, percentualS, percentualR;
  char tipoCobaia;

  sapo = 0;
  rato = 0;
  coelho = 0;
  totalCobaias = 0;

  System.out.printf("Quantos casos de teste serao digitados? ");
  numeroDeCasos = scanner.nextInt();

  for (int i = 1; i <= numeroDeCasos; i++){
   System.out.printf("Quantidade de cobaias: ");
   qntdCobaias = scanner.nextInt();
   System.out.printf("Tipo de cobaia (S,C,R): ");
   tipoCobaia = scanner.next().charAt(0);

   switch (tipoCobaia){
    case 'S':
     sapo += qntdCobaias;
     break;
    case 'C':
     coelho += qntdCobaias;
     break;
    case 'R':
     rato += qntdCobaias;
     break;
   }

   totalCobaias += qntdCobaias;

  }

  percentualS = ((double)sapo / totalCobaias) * 100;
  percentualR = ((double)rato / totalCobaias) * 100;
  percentualC = ((double)coelho / totalCobaias) * 100;

  System.out.println("RELATORIO FINAL:");
  System.out.printf("Total: %d cobaias\n", totalCobaias);
  System.out.printf("Total de coelhos: %d\n", coelho);
  System.out.printf("Total de ratos: %d\n", rato);
  System.out.printf("Total de sapos: %d\n", sapo);
  System.out.printf("Percentual de coelhos: %.2f\n" ,percentualC);
  System.out.printf("Percentual de ratos: %.2f\n" ,percentualR);
  System.out.printf("Percentual de sapos: %.2f\n" ,percentualS);

  System.out.println("------------------------------------------------------");

  // exercise 47 | Fatorial

  int fatorial, mg;

  System.out.println("Digite o valor de M: ");
  m = scanner.nextInt();

  fatorial = 1;

  for(int i = 1; i <= m; i++){

   fatorial *= i;

  }

  System.out.println("FATORIAL: " + fatorial);


 }
}