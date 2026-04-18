import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Preencha um vetor de n números com valores aleatórios advindos do console.
        // Ordene este vetor.
        // Em seguida, receba um nome e exiba na tela a quantidade de vogais que esse nome possui.

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Seja Bem-vindo! \nPreencha o tamanho do seu vetor:");
        Randomizer();
        System.out.println("Agora digite um nome:");
        reader();

        scan.close();

    }


    public static void Randomizer() {


        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int size = scan.nextInt();
        int vetor[] = new int[size];

        for (int x = 0; x < size; x++) {
            vetor[x] = random.nextInt(1000);
        }
        ;


        System.out.println("\nOs números aleatorios são:\n");
        for (int x = 0; x < size; x++) {
            System.out.println(vetor[x]);
        }

        for (int x = 0; x < vetor.length; x++) {
            for (int y = 0; y < vetor.length; y++) {

                if (vetor[y] > vetor[x]) {

                    int aux = vetor[x];
                    vetor[x] = vetor[y];
                    vetor[y] = aux;
                }

            }
        }
        System.out.println("\nOs números ordenados são:\n");
        for (int x = 0; x < size; x++) {
            System.out.println(vetor[x]);
        }


    }


    public static void reader() {
        Scanner scan = new Scanner(System.in);


        String nome = scan.nextLine();

        int contador = 0;


        for (int y = 0; y < nome.length(); y++) {
               char letra = Character.toLowerCase(nome.charAt(y));

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
                    contador++;
                }




            }System.out.println("A quantidade de Vogais é/são: " + contador);


        }
    }



