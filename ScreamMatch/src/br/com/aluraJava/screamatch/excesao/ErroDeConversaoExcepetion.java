package br.com.aluraJava.screamatch.excesao;

public class ErroDeConversaoExcepetion extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoExcepetion(String mensagem) {
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
