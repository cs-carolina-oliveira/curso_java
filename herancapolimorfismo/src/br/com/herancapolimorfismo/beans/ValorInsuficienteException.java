package br.com.herancapolimorfismo.beans;

public class ValorInsuficienteException extends RuntimeException {
    public ValorInsuficienteException(double valor) {
        super("Valor inválido " + valor);
    }
}
