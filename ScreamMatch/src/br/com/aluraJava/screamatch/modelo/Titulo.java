package br.com.aluraJava.screamatch.modelo;

import br.com.aluraJava.screamatch.excesao.ErroDeConversaoExcepetion;
import br.com.aluraJava.screamatch.principal.TituloOmdb;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

  private String nome;
  private int anoLancamento;
  private String sinopseFilme;
  private int duracaoEmMinutos;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalAvaliacao;

  public Titulo (String nome, int anoLancamento){
    this.nome = nome;
    this.anoLancamento = anoLancamento;
  }

  public Titulo (TituloOmdb meuTituloOmdb){
    this.nome = meuTituloOmdb.title();
    if (meuTituloOmdb.year().length() > 4 ){
      throw new ErroDeConversaoExcepetion("Nao consegui converte o ano" +
              "porquie tem mais de 4 caractertes");
    }
    this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
    this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));


  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSinopseFilme() {
    return this.sinopseFilme;
  }

  public void setSinopseFilme(String sinopseFilme) {
    this.sinopseFilme = sinopseFilme;
  }

  public int getAnoLancamento() {
    return this.anoLancamento;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public int getDuracaoEmMinutos() {
    return this.duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public boolean isIncluidoNoPlano() {
    return this.incluidoNoPlano;
  }

  public boolean getIncluidoNoPlano() {
    return this.incluidoNoPlano;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public double getSomaDasAvaliacoes() {
    return this.somaDasAvaliacoes;
  }

  public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
    this.somaDasAvaliacoes = somaDasAvaliacoes;
  }

  public int getTotalAvaliacao() {
    return this.totalAvaliacao;
  }

  public void setTotalAvaliacao(int totalAvaliacao) {
    this.totalAvaliacao = totalAvaliacao;
  }
   
  //getters
  int getTotaAvaliacoes(){
    return totalAvaliacao;
  }

 public void exibeFichaTecnica (){
    System.out.println("resumo do filme: " + sinopseFilme);
  }

   public void exibiAnoLancamento(){
    System.out.println("Ano de lancamento:" +anoLancamento);
  }


  public void avalia(double nota ){
    somaDasAvaliacoes += nota;
    totalAvaliacao++;
  }

  @Override
  public int compareTo(Titulo outroTitulo) {
   return this.getNome().compareTo(outroTitulo.getNome());
  }

  @Override
  public String toString() {
    return "Titulo{" +
            "nome='" + nome + '\'' +
            ", anoLancamento=" + anoLancamento +
            ", duracaoEmMinutos=" + duracaoEmMinutos +
            '}';
  }
}


