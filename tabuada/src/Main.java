import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {

            Scanner scanner = new Scanner(System.in);

            int opcao;

            System.out.println("Seja bem-vindo a tabuada.");

            System.out.println("Digite um numero inteiro:");
            tabela();

            do {
                System.out.println("Escolha: \n1 para Continuar \n2 para Sair:");
                opcao = scanner.nextInt();

                if (opcao == 1) {
                    words();

                    continue;
                } else if (opcao < 1 || opcao > 2){

                    System.out.println("Esse número é inválido");
                } ;


            } while (opcao != 2);

            System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
        }


    }

    public static void tabela() {

        int numero, tabuada;

        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();

        tabuada = 1;

        System.out.println("A tabuada de " + numero + "  é: \n");

        while (tabuada < 11) {
            System.out.println(numero * tabuada);
            tabuada++;


        }
    }

    public static void words() {

        Scanner scanner = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase:");
        frase = scanner.next();
        System.out.println("\n" + frase);


    }
}


