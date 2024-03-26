package br.com.aluraJava.screamatch.calculos;
import br.com.aluraJava.screamatch.modelo.Filme;

public class CalculadoraDeTempo {
  private int tempoTotal = 0;

  public int getTempoTotal(){
    return this.tempoTotal;
  }

    public void inclui(Filme f){
      this.tempoTotal += f.getDuracaoEmMinutos();
    }
}
