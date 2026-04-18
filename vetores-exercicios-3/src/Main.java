import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receba um nome qualquer do usuário.
        //Percorra esse nome num vetor e exiba o vetor com o nome invertido.


        Scanner scan = new Scanner(System.in);

        System.out.println("Seja Bem-vindo! \nDigite um nome:");
        String nome = scan.nextLine();

        char[] letras = nome.toCharArray();

        System.out.print("O nome invertido fica: \n");

        for (int x = 0; x < letras.length; x++ ) {
            for (int y = x; y < letras.length; y++) {

                if (letras[x] < letras[y]) {
                    char aux = letras[x];
                    letras[x] = letras[y];
                    letras[y] = aux;

                }else if (letras[x] > letras[y]) {
                    char aux = letras[y];
                    letras[y] = letras[x];
                    letras[x] = aux;
                }
                else {
                    letras[x] = letras[y];
                }
                }

                //for (int x = letras.length - 1; x >= 0; x--) {
             //   System.out.print(letras[x]);
            //}

                System.out.print(letras[x]);

            }
        }
    }






