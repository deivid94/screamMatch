package br.com.aluraJava.screamatch.modelo;
import br.com.aluraJava.screamatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;
  public String getDiretor(){
    return diretor;
  }


  public Filme(String nome, int anoLancamento, String diretor){
    super(nome, anoLancamento);
    this.diretor = diretor;
  }


  @Override
  public int getClassificacao() {
    return(int )getSomaDasAvaliacoes() / 2;
  }

  @Override
  public String toString() {
    return ("Filme:  "+ this.getNome() + "(" + this.getAnoLancamento()+")");
  }
}
