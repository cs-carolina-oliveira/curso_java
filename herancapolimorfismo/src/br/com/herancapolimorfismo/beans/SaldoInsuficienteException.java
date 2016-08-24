package br.com.herancapolimorfismo.beans;

public class SaldoInsuficienteException extends RuntimeException {
    SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
