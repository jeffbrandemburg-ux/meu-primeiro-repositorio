import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo!");

        System.out.println("Digite seu primeiro nome, por favor.");
        String name = scanner.nextLine();

        System.out.println("Digite seu sobrenome, por favor.");
        String surname = scanner.nextLine();

        System.out.println("Digite seu CPF, por favor.");
        String CPF = scanner.nextLine();

        System.out.println("Digite seu estado civil, por favor.");
        String estado = scanner.nextLine();

        System.out.println("Digite sua idade, por favor.");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso, por favor.");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura, por favor.");
        double altura = scanner.nextDouble();


        System.out.println();

        scanner.close();

        System.out.println("Seu nome completo é " + name + " " + surname);
        System.out.println("Seu CPF é " + CPF);
        System.out.println("Sua idade é " + idade);
        System.out.println("Seu peso é " + peso + " e sua altura é " + altura);
        System.out.println("Seu estado civil é " + estado);

        {

        }
    }
}