import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Crie uma matriz 3x3 e a preencha manualmente com números inteiros.
    // Depois, imprima mostrando no console todos os elementos da matriz, na ordem que eles se encontram, linha por linha, usando um loop.


        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Olá, seja bem-vindo!");

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Por favor, digite um numero inteiro para preencher o espaco: " + x + " " + y);
                matriz[x][y] = scan.nextInt();

            }


        }for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");

            }System.out.println();
    }
}
}




