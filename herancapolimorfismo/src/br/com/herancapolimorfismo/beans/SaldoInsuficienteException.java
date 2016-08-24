package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class SaldoInsuficienteException extends RuntimeException{
    SaldoInsuficienteException(String msg){
        super(msg);
    }
}
