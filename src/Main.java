//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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


    }
}