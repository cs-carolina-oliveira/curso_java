package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class ValorInsuficienteException extends RuntimeException{
    public ValorInsuficienteException(double valor){
        super("Valor inválido "+valor);
    }
}
git checkout 