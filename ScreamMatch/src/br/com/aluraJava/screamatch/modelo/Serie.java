package br.com.aluraJava.screamatch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorSeasson;
    private int minutosPorEpisodio;

    public Serie (String nome, int anoLancamento){
        super(nome, anoLancamento);


    }

    public int getTemporada(){
      return temporadas;
    }
    public void setTemporadas(int temporadas){
      this.temporadas = temporadas;
    }
    public boolean getAtiva(){
      return ativa;
    }
    public void setAtiva(boolean ativa){
      this.ativa = ativa;
    }
    public int getEpsodiosPorTemporada(){
      return episodiosPorSeasson;
    }
    public void setEpsodioPorTemporada (int episodiosPorTemporada){
      this.episodiosPorSeasson = episodiosPorTemporada;
    }
    public int getMinutosPorEpsodio(){
      return minutosPorEpisodio;
    }
    public void setMinutosPorEpsodio(int minutosPorEpisodio){
      this.minutosPorEpisodio = minutosPorEpisodio;
    }
    public int  getDuracaoEmMinutos(){
      return temporadas * episodiosPorSeasson * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}




