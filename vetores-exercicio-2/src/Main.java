import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receba um vetor de n números inteiros inseridos pelo usuário.
        //Percorra o vetor altere o valor de cada posição: se o valor da posição for par, seu novo valor deve ser multiplicado por 2, se for ímpar, o novo valor da posição deve ser ele mesmo elevado por 2.
        // Exiba o conteúdo do novo vetor.

        Scanner scan = new Scanner(System.in);

        System.out.println("Seja Bem-vindo! \nPreencha o tamanho do seu vetor:");

        int size = scan.nextInt();
        double[] vetor = new double[size];


        for (int x = 0; x < size; x++) {
            System.out.println("Digite um valor inteiro para posição " + x + " do seu vetor:");
            vetor[x] = scan.nextInt();

        }
        ;

        System.out.println("Seus vetores são:");

        for (int x = 0; x < size; x++) {
            System.out.println(vetor[x]);
        }

        System.out.println("Os valores alterados");
        for (int x = 0; x < size; x++) {
            if (vetor[x] % 2 == 0) {
                vetor[x] = vetor[x] * 2;


            } else {
                vetor[x] = Math.pow(vetor[x], 2);
            }
            ;

        }
        System.out.println("Seus vetores alterados são:");

        for (int x = 0; x < size; x++) {
            System.out.println(vetor[x]);
        }
        scan.close();
    }

}











