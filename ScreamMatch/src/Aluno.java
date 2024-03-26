public class Aluno {
  private String nome;
  private double primeirAvaliacao;
  private double segundAvaliacao;
  private double terceirAvaliacao;

  //GETTERS
  public String getNome (){
    return this.nome;
  }
   public Double getPrimeiraAvaliacao(){
    return this.primeirAvaliacao;
   }

   public Double getSegundaAvaliacao(){
    return this.segundAvaliacao;
   }

   public Double getTerceiraAvaliacao(){
    return this.terceirAvaliacao;
   }
   //SETTERS

   public void setNome(String nome){
    this.nome = nome;
   }

   public void setPrimeirAvaliacao( double nota){
    this.primeirAvaliacao = nota;
   }

    public void setSegundAvaliacao(double nota){
      this.segundAvaliacao = nota;
    }
    public void setTerceirAvaliacao(double nota){
      this.terceirAvaliacao = nota;
    }
}




