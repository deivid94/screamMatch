public class Aluno {
  String nome;
  int idade;
  String genero;

  public Aluno (String nome, int idade, String genero){
    this.nome = nome;
    this.idade = idade;
    this.genero = genero;
  }
  

  void exibirDadosAluno(){
    System.out.println("Informacoes do aluno");  
    System.out.println("Nome" + nome);  
    System.out.println("Idade: " + idade);
    System.out.println("Genero: " + genero);

}

}




