public class Reserva {

   private String Nome;
   private String quarto;
   private int dias;
   private double diaria;


   public Reserva(String Nome, String quarto, int dias, double diaria){

       this.Nome = Nome;
       this.quarto = quarto;

   }
   //Metodo de Sobrecarga
    public Reserva(String Nome, String quarto){

       this.Nome = Nome ;
       this.quarto = quarto;
       this.dias = 1;
       this.diaria = 100;

    }
    // coletadores de dados
    public String getNome(){
       return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getquarto() {
        return quarto;
    }

    public void setquarto(String quarto) {
        this.quarto = quarto;
    }

    public int getdias() {
        return dias;
    }

    // tem que impedir loops e erros nas boas praticas.
    public void stedias(int dias){
       if (dias < 1){
           System.out.println("Número inválido.");
       }else {
           this.dias = dias;
       }

    }
    public double getdiaria() {
        return diaria;

    }

    //Mesma coisa da anterior.
    public void setdiaria(double diaria) {
        if (diaria <= 0) {
            System.out.println("Valor inválido.");
            this.diaria = 100;
        } else {
            this.diaria = diaria;
        }

   }public double calculadoradediaria() {

        return dias * diaria;

   }

    @Override
    public String toString() {
        return "\nHóspede: " + Nome +
                "\nTipo do quarto: " + quarto +
                "\nDias hospedado: " + dias +
                "\nValor da diária: R$" + diaria +
                "\nValor total: R$" + calculadoradediaria();

}
}
