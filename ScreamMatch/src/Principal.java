import br.com.aluraJava.screamatch.modelo.Filme;
import br.com.aluraJava.screamatch.modelo.Serie;

public class Principal {
  public static void main(String[] args) {
     Filme novoFilme = new Filme();
      novoFilme.setNome("Lobo de WallStreet");
      novoFilme.setAnoLancamento(2014);
      novoFilme.setDuracaoEmMinutos(180);
      System.out.println("Duracao do filme: " +novoFilme.getDuracaoEmMinutos());
  
    Serie miamiDesign = new Serie();
    miamiDesign.setNome("MIami Design");
    miamiDesign.setAnoLancamento(2019);
    miamiDesign.exibeFichaTecnica();
    miamiDesign.setTemporadas(4);
    miamiDesign.setEpsodioPorTemporada(10);
    miamiDesign.setDuracaoEmMinutos( 240);
    miamiDesign.setMinutosPorEpsodio(45);
    System.out.println("Duracao da serie" +miamiDesign.getDuracaoEmMinutos());
   }

  

}