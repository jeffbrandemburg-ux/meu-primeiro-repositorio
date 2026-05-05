public class Aluno {
    private String nome;
    private double[] notas;


    public Aluno(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    // esse e o validador para impedir a tela de invalido
    public void colocarnota(int index, double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida! Deve estar entre 0 e 10.");
        }
        notas[index] = nota;
    }
    // calculador de media
    public double calcularmedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    //Expositor de dados e aprovacao ou reprovacao (consedere 6 a media)
    public void exibirdados() {
        System.out.println("Aluno: " + nome);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nMédia: " + calcularmedia());
        if (calcularmedia() < 6){
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Aprovado");}
    }
}





