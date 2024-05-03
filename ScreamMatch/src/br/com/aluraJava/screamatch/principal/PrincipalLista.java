package br.com.aluraJava.screamatch.principal;

import br.com.aluraJava.screamatch.modelo.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalLista {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<TituloOmdb> arquivoDefilmes = new ArrayList<>();



        while (!busca.equalsIgnoreCase("sair")) {


            System.out.println("Digite o filme para busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")){
                break;
            }


            String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=6de054f5";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                arquivoDefilmes.add(meuTituloOmdb);
                System.out.println("Titulo convertido: ");
                FileWriter escrita = new FileWriter("filmes.json");
                escrita.write(gson.toJson(arquivoDefilmes));
                escrita.close();

                System.out.println(meuTitulo);
            } catch (NumberFormatException e) {

            } catch (Exception e) {
                System.out.println("Seguine ereo de excecao: " + e.getMessage());
            }
        }
    }
}