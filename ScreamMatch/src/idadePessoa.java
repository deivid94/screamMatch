public class idadePessoa {
  private String nome;
  private int idade;
  
  public String getNome(){
    return this.nome;
  }
  
  public void setNome (String nome){
   this.nome = nome;
}

  public int getIdade (){
  return this.idade;
}

public void setIdade (int idade){
  this.idade = idade;
}

  public void verificarIdade (){
    if (getIdade() >= 18){
      System.out.println("Usuario maior de idade, acesso aceito.");
    } else {
      System.out.println("Usuario menor de idade permissao negada.");
    }
  }

}


