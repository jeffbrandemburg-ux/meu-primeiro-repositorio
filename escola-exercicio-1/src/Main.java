import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Crie o objeto Aluno, com atributos e métodos de sua preferência.
        //Crie um vetor "nota" de n posições, representando a quantidade de provas que os alunos fizeram no ano.
        //Permita que um usuário crie n Alunos e digite os valores das notas que cada aluno tirou durante o ano.
        //Ao final, exiba os dados de cada aluno e as médias de cada um. As médias representam a soma das notas dividido pela quantidade de notas.
        //Crie cada aluno com parâmetros de construtores de sua escolha. O objeto aluno deve seguir os padrões de modificadores de acesso vistos no módulo para a construção de um POJO.
        //Não permita que um aluno tenha uma nota menor do que zero ou maior do que 10. Informe o usuário que ele digitou uma nota inválida e precisa repreencher a nota em caso de invalidez.
        //fazer comentarios para ajudar outros programadores (vi em um meme que e um bom abito)

        System.out.println("Olá, seja bem-vindo!");
        System.out.println("Quantos alunos deseja cadastras?");
        int numeroalunos = scan.nextInt();

        System.out.println("Quantas provas cada aluno fez?");
        int numeronotas = scan.nextInt();


        Aluno[] alunos = new Aluno[numeroalunos];


        // calculador (tenho problemas com for, espero que de certo)
        for (int x = 0; x < numeroalunos; x++) {
            scan.nextLine();


            System.out.print("Nome do aluno " + (x + 1) + ": ");
            String nome = scan.nextLine();


            alunos[x] = new Aluno(nome, numeronotas);


            for (int y = 0; y < numeronotas; y++) {
                double nota;
                while (true) {
                    System.out.print("Digite a nota " + (y + 1) + " (0 a 10): ");
                    nota = scan.nextDouble();

                    if (nota >= 0 && nota <= 10) {
                        alunos[x].colocarnota(y, nota);
                        break;
                    } else {
                        System.out.println("Tente novamente. Um numero de 0 a 10");
                    }
                }
            }
        }

            System.out.println("\nResultados:");
            for (Aluno aluno : alunos) {
                aluno.exibirdados();
            }

            scan.close(); // bons abitos fechar scan



    }
}
