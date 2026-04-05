import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo! \nDigite seu primeiro nome, por favor:");
        String nome = scanner.next();

        int letras = nome.length();

        lapis();

        if (letras > 6){
            while (letras > 0){
                System.out.println(nome);
                letras--;
            }
        }else System.out.println(nome);






    }public static void lapis() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Agora digite um número positivo e inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Essa contagem é crescente!");
        if (numero >= 0) {
            for (int n0 = 0; n0 <= numero; n0 = n0 + 1) {
                System.out.println(n0);
            }
        } else System.out.println("Esse número é inválido.");

        System.out.println("Essa contagem é decrescente!");
        if (numero >= 0) {
            for (int n0 = numero; n0 >= 0; n0 = n0 - 1) {
                System.out.println(n0);
            }
        } else System.out.println("Esse número é inválido.");
    }
}




