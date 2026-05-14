import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //E o projeto do Hotel, ele e muito grande pra colocar aqui

        Scanner scan = new Scanner(System.in);

        //variavel de preco
        Reserva[] standard = new Reserva[10];
        Reserva[] luxo = new Reserva[10];
        Reserva[] presidencial = new Reserva[10];

        int reservasstandard = 0;
        int reservasluxo = 0;
        int reservaspresidencial = 0;

        int opcao, tipo;

        do {
            Menu();

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {


                case 1: {

                    tipodequarto();

                    tipo = scan.nextInt();

                    switch (tipo){

                    case 1:
                        standardReserva(scan, standard, reservasstandard);
                        break;

                    case 2:
                        luxoReserva(scan, luxo, reservasluxo);
                        break;

                    case 3:
                        presidencialReserva(scan, presidencial, reservaspresidencial);
                        break;

                    default:
                        System.out.println("Opção inválida!");
                    }
                }

                    break;

                case 2:
                    listarReservas(standard, luxo, presidencial, reservasstandard, reservasluxo, reservaspresidencial);
                    break;

                case 3:
                    buscarReserva(scan, standard, luxo, presidencial, reservasstandard, reservasluxo, reservaspresidencial);
                    break;

                case 4:
                    ordenarReservas(standard, luxo, presidencial, reservasstandard, reservasluxo, reservaspresidencial);
                    System.out.println("Reservas ordenadas.");
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    System.out.println("Obrigado pela preferencia");
                    break;

                default:
                    System.out.println("Opção inválida!");


            }

        } while (opcao != 5);
    }

    public static void Menu() {

        System.out.println("\nHOTEL TABAJARA");
        System.out.println("1 - Reservar");
        System.out.println("2 - Listar reservas");
        System.out.println("3 - Buscar reserva");
        System.out.println("4 - Ordenar reservas");
        System.out.println("5 - Sair");
        System.out.print("Escolha: ");
    }

    public static void tipodequarto() {

        System.out.println("\n1 - Standard");
        System.out.println("2 - Luxo");
        System.out.println("3 - Presidencial");
        System.out.print("Escolha: ");

    }
// tentado fazer 3 reservas diferentes. espero que de certo


    public static int standardReserva(Scanner scan, Reserva[] standard, int reservasstandard) {

        if (reservasstandard >= standard.length) {
            System.out.println("Vagas Esgotadas!");
            return reservasstandard;
        }
        String type = "Standard";
        scan.nextLine();

        System.out.print("Nome do hóspede: ");
        String nome = scan.nextLine();

        System.out.print("Tipo do quarto: \n" + type + "\n");


        System.out.print("Número de dias: ");
        int dias = scan.nextInt();

        System.out.print("Valor da diária: ");
        double diaria = scan.nextDouble();
        scan.nextLine();

        standard[reservasstandard] =
                new Reserva(nome, type, dias, diaria);

        reservasstandard++;

        System.out.println("Cadastro realizado com sucesso!");

        return reservasstandard;


    }

    public static int luxoReserva(Scanner scan, Reserva[] luxo, int reservasluxo) {

        if (reservasluxo >= luxo.length) {
            System.out.println("Vagas Esgotadas!");
            return reservasluxo;
        }
        String type = "Luxo";
        scan.nextLine();

        System.out.print("Nome do hóspede: ");
        String nome = scan.nextLine();

        System.out.print("Tipo do quarto: \n" + type + "\n");


        System.out.print("Número de dias: ");
        int dias = scan.nextInt();

        System.out.print("Valor da diária: ");
        double diaria = scan.nextDouble();
        scan.nextLine();

        luxo[reservasluxo] =
                new Reserva(nome, type, dias, diaria );

        reservasluxo++;

        System.out.println("Cadastro realizado com sucesso!");

        return reservasluxo;


    }

    public static int presidencialReserva(Scanner scan, Reserva[] presidencial, int reservaspresidencial) {
        if (reservaspresidencial >= presidencial.length) {
            System.out.println("Vagas Esgotadas!");
            return reservaspresidencial;
        }
        String type = "Presidencial";
        scan.nextLine();

        System.out.print("Nome do hóspede: ");
        String nome = scan.nextLine();

        System.out.print("Tipo do quarto: \n" + type + "\n");


        System.out.print("Número de dias: ");
        int dias = scan.nextInt();

        System.out.print("Valor da diária: ");
        double diaria = scan.nextDouble();
        scan.nextLine();

        presidencial[reservaspresidencial] =
                new Reserva(nome, type, dias, diaria );

        reservaspresidencial++;

        System.out.println("Cadastro realizado com sucesso!");

        return reservaspresidencial;

    } //tentar listar cada um separado

    public static void listarReservas(Reserva[] standard, Reserva[] luxo, Reserva[] presidencial, int reservasstandard, int reservasluxo, int reservaspresidencial) {

        if (reservasstandard + reservasluxo + reservaspresidencial == 0) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }

        System.out.println("\n===== LISTA DE RESERVAS =====");

        for (int i = 0; i < reservasstandard; i++) {

            System.out.println("\nReserva " + (i + 1));
            System.out.println(standard[i]);
        }
        for (int i = 0; i < reservasluxo; i++) {

            System.out.println("\nReserva " + (i + 1));
            System.out.println(luxo[i]);
        }
        for (int i = 0; i < reservaspresidencial; i++) {

            System.out.println("\nReserva " + (i + 1));
            System.out.println(presidencial[i]);
        }
    }// code de busca, tentei, nao consigo fazer o calculo de teste do cpf

    public static void buscarReserva(Scanner scan, Reserva[] standard, Reserva[] luxo, Reserva[] presidencial, int reservasstandard, int reservasluxo, int reservaspresidencial) {

        if (reservasstandard + reservasluxo + reservaspresidencial == 0) {
            System.out.println("Nenhuma reserva encontrada.");
            return;
        }

        System.out.print("Digite parte do nome do hóspede: ");
        String busca = scan.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < reservasstandard; i++) {

            String nome = standard[i].getNome();

            if (nome.toLowerCase().contains(busca.toLowerCase())) {

                System.out.println("\nReserva encontrada:");
                System.out.println(standard[i]);

                encontrou = true;
            }
        }
        for (int i = 0; i < reservasluxo; i++) {

            String nome = luxo[i].getNome();

            if (nome.toLowerCase().contains(busca.toLowerCase())) {

                System.out.println("\nReserva encontrada:");
                System.out.println(standard[i]);

                encontrou = true;
            }
        }
        for (int i = 0; i < reservaspresidencial; i++) {

            String nome = presidencial[i].getNome();

            if (nome.toLowerCase().contains(busca.toLowerCase())) {

                System.out.println("\nReserva encontrada:");
                System.out.println(standard[i]);

                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma reserva encontrada.");
        }
    }// que codigo grande, essa parte e maneira =)

    public static void ordenarReservas(Reserva[] standard, Reserva[] luxo, Reserva[] presidencial, int reservasstandard, int reservasluxo, int reservaspresidencial) {

        for (int x = 0; x < reservasstandard - 1; x++) {

            for (int y = 0; y < reservasstandard - 1 - x; y++) {

                if (standard[y].getdias() < standard[y + 1].getdias()) {

                    Reserva ordem = standard[y];
                    standard[y] = standard[y + 1];
                    standard[y + 1] = ordem;
                }

                for (int a = 0; a < reservasluxo - 1; a++) {

                    for (int b = 0; b < reservasluxo - 1 - a; b++) {

                        if (luxo[b].getdias() < luxo[b + 1].getdias()) {

                            Reserva ordem = luxo[b];
                            luxo[b] = luxo[b + 1];
                            luxo[b + 1] = ordem;
                        }


                        for (int i = 0; i < reservaspresidencial - 1; i++) {

                            for (int j = 0; j < reservaspresidencial - 1 - i; j++) {

                                if (presidencial[j].getdias() < presidencial[j + 1].getdias()) {

                                    Reserva ordem = presidencial[j];
                                    presidencial[j] = presidencial[j + 1];
                                    presidencial[j + 1] = ordem;
                                }


                            }

                        }

                    }

                }

            }
        }
    }
}


