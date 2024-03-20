public class Musica {
  String titulo;
  String artista;
  int anoLancamento;
  double avaliacao ;
  double numAvaliacoes;

  void exibiFixaTecnica (){
    System.out.println("Ficha tecnica Direcao: fulando, Producao Ciclano, Estudio: zezinho");
  }
  void avaliar(double avaliacao){
    this.avaliacao += avaliacao;
    System.out.println("Avaliacao: " + this.avaliacao);
  }

  void mediaDasAvaliacoes (){ // refazer logica
      double mediaAvaliacao = (avaliacao / 2 );
      System.out.println( "Media das avaliacoes" + mediaAvaliacao );
  }

}
