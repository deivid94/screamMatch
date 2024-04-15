package br.com.aluraJava.screamatch.modelo;
import br.com.aluraJava.screamatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

  public String getDiretor(){
    return diretor;
  }
  public void setDiretor (String diretor ){
    this.diretor = diretor;
  }

  @Override
  public int getClassificacao() {
    return(int )getSomaDasAvaliacoes() / 2;
  }
}
