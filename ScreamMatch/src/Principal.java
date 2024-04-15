import br.com.aluraJava.screamatch.calculos.CalculadoraDeTempo;
import br.com.aluraJava.screamatch.calculos.FiltroDeRecomendacao;
import br.com.aluraJava.screamatch.modelo.Epsodio;
import br.com.aluraJava.screamatch.modelo.Filme;
import br.com.aluraJava.screamatch.modelo.Serie;

public class Principal {
  public static void main(String[] args) {
     Filme novoFilme = new Filme();
      novoFilme.setNome("Lobo de WallStreet");
      novoFilme.setAnoLancamento(2014);
      novoFilme.setDuracaoEmMinutos(180);

  
    Serie miamiDesign = new Serie();
    miamiDesign.setNome("MIami Design");
    miamiDesign.setAnoLancamento(2019);
    miamiDesign.exibeFichaTecnica();
    miamiDesign.setTemporadas(4);
    miamiDesign.setEpsodioPorTemporada(10);
    miamiDesign.setDuracaoEmMinutos( 240);
    miamiDesign.setMinutosPorEpsodio(45);


        Filme VelosesEFuriosos = new Filme();
        VelosesEFuriosos.setNome("Veloses e Furiosos");
        VelosesEFuriosos.setAnoLancamento(2001);
        VelosesEFuriosos.setDuracaoEmMinutos(210);

      CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
      calculadora.inclui(novoFilme);
      calculadora.inclui(VelosesEFuriosos);
      System.out.println( calculadora.getTempoTotal());

      FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();


        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(miamiDesign);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);

   }

  

}