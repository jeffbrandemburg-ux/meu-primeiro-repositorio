
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo!");

        System.out.println("Digite o primeiro número a ser testado, por favor.");

        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número a ser testado, por favor.");

        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais!");

        } else if (numero1 > numero2) {
            System.out.println("O maior número é:{" + numero1 + "}.");

        } else {
                System.out.println("O maior número é:{" + numero2 + "}.");

    }scanner.close();

    }
}