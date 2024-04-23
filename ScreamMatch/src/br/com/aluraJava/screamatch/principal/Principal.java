package br.com.aluraJava.screamatch.principal;

import br.com.aluraJava.screamatch.calculos.CalculadoraDeTempo;
import br.com.aluraJava.screamatch.calculos.FiltroDeRecomendacao;
import br.com.aluraJava.screamatch.modelo.Filme;
import br.com.aluraJava.screamatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {



        //SERIES
        Serie miamiDesign = new Serie("Miami Design", 2022);
        miamiDesign.setTemporadas(4);
        miamiDesign.setMinutosPorEpsodio(60);

        var todoMundoOdeiaOChris = new Serie("Todo mundo odeia o chris", 2014);
        todoMundoOdeiaOChris.setEpsodioPorTemporada(6);
        todoMundoOdeiaOChris.setMinutosPorEpsodio(45);


        //FILMES
        var VelosesEFuriosos = new Filme("Velosos e Furiosos", 2001,"Vin Diesel");
        VelosesEFuriosos.setDuracaoEmMinutos(180);
        VelosesEFuriosos.avalia(10);

        var loboDeWallStreet = new Filme("Lobo de wall Street", 2017,"James cameron");
        loboDeWallStreet.setDuracaoEmMinutos(180);
        loboDeWallStreet.avalia(10);

        var oMeninoQueDescobriuOvento = new Filme("O menino que descobriu o vento", 2019,"Chiwetel Ejiofor");
        oMeninoQueDescobriuOvento.setDuracaoEmMinutos(200);
        oMeninoQueDescobriuOvento.avalia(9.5);


        //Metodos de calculo de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(VelosesEFuriosos);

        // filtro de recomendacao de filme
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();



        //Cria uma lista com todos filmes.

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(loboDeWallStreet);
        ListaDeFilmes.add(VelosesEFuriosos);
        ListaDeFilmes.add(oMeninoQueDescobriuOvento);

        ArrayList<Serie>ListaDeSeries = new ArrayList<>();
        ListaDeSeries.add(todoMundoOdeiaOChris);
        ListaDeSeries.add(miamiDesign);

            // debug mostrar todos os filmes, primeiro filme, quantidade de filmes
        System.out.println("Quantidade de filmes dentro do array: "+ ListaDeFilmes.size());
        System.out.println(ListaDeFilmes.toString());


        //debug mostrar lista de series:
        System.out.println("Lista de series: " +ListaDeSeries.toString());
        }




    }


