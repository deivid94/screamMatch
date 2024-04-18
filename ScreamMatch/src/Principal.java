import br.com.aluraJava.screamatch.calculos.CalculadoraDeTempo;
import br.com.aluraJava.screamatch.calculos.FiltroDeRecomendacao;
import br.com.aluraJava.screamatch.modelo.Epsodio;
import br.com.aluraJava.screamatch.modelo.Filme;
import br.com.aluraJava.screamatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Serie miamiDesign = new Serie();
        miamiDesign.setNome("MIami Design");
        miamiDesign.setAnoLancamento(2019);
        miamiDesign.exibeFichaTecnica();
        miamiDesign.setTemporadas(4);
        miamiDesign.setEpsodioPorTemporada(10);
        miamiDesign.setDuracaoEmMinutos(240);
        miamiDesign.setMinutosPorEpsodio(45);


        Filme VelosesEFuriosos = new Filme();
        VelosesEFuriosos.setNome("Veloses e Furiosos");
        VelosesEFuriosos.setAnoLancamento(2001);
        VelosesEFuriosos.setDuracaoEmMinutos(210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(VelosesEFuriosos);


        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();


        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(miamiDesign);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);

        var loboDeWallStreet = new Filme();
        loboDeWallStreet.setNome("Lobo de wall street");
        loboDeWallStreet.setAnoLancamento(2018);
        loboDeWallStreet.setDuracaoEmMinutos(180);
        loboDeWallStreet.avalia(10);

        var oMeninoQueDescobriuOvento = new Filme();
        oMeninoQueDescobriuOvento.setNome("O menino que descobriu o vento");
        oMeninoQueDescobriuOvento.setAnoLancamento(2020);
        oMeninoQueDescobriuOvento.setDuracaoEmMinutos(200);
        oMeninoQueDescobriuOvento.avalia(9.5);

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(loboDeWallStreet);
        ListaDeFilmes.add(VelosesEFuriosos);
        ListaDeFilmes.add(oMeninoQueDescobriuOvento);

        System.out.println("Quantidade de filmes dentro do array: "+ ListaDeFilmes.size());
        System.out.println("primeiro Filme: "+ ListaDeFilmes.get(0).toString()); //
        System.out.println(ListaDeFilmes.toString());




    }



}