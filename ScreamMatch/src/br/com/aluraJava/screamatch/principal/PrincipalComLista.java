package br.com.aluraJava.screamatch.principal;

import br.com.aluraJava.screamatch.modelo.Filme;
import br.com.aluraJava.screamatch.modelo.Serie;
import br.com.aluraJava.screamatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {


        Serie miamiDesign = new Serie("Miami Design", 2022);
        var todoMundoOdeiaOChris = new Serie("Todo mundo odeia o chris", 2014);
        var VelosesEFuriosos = new Filme("Velosos e Furiosos", 2001,"Vin Diesel");
        var loboDeWallStreet = new Filme("Lobo de wall Street", 2017,"James cameron");
        var oMeninoQueDescobriuOvento = new Filme("O menino que descobriu o vento", 2019,"Chiwetel Ejiofor");

        //LISTAS DE TODOS OS ITEMS

        ArrayList <Titulo> lista = new ArrayList<>();
        lista.add(todoMundoOdeiaOChris);
        lista.add(VelosesEFuriosos);
        lista.add(loboDeWallStreet);
        lista.add(oMeninoQueDescobriuOvento);

        for (Titulo item:lista ){
            System.out.println(item);
            System.out.println("nome: "+ item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }


    }
}
