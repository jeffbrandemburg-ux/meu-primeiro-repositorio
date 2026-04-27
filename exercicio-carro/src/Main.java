import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carros[] car = new Carros[50];


        // Permita que o usuário crie uma quantidade definida por ele de objetos do tipo Carro (no máximo 50), definindo os atributos de cada objeto carro.
        // Armazene esses objetos em um vetor de tipo Carro.
        // Exiba o nome de todos os carros, a quantidade de carros criados e a soma do preço total deles.

        System.out.println("Seja bem vindo!");

        System.out.println("Coloque um número de carros, com o máximo sendo 50, que deseja cadastrar:");
        int size = scan.nextInt();
        if (size > 50) {
            size = 50;
            System.out.println("Numero invalido! Tente novamente.");



        }for (int i = 0; i < size; i++) {
            scan.nextLine();
            System.out.println("\nCarro " + (i + 1));

            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Preço: ");
            double preco = scan.nextDouble();
            scan.nextLine();

            car[i] = new Carros(nome, preco);
        }
        double soma = 0;

        System.out.println("\nLista de carros ");
        for (int i = 0; i < size; i++) {
            System.out.println("Nome: " + car[i].nome);
            soma += car[i].preco;
        }

        System.out.println("\nQuantidade de carros: " + size);
        System.out.println("Soma total dos preços: R$ " + soma);

        scan.close();
    }



    }