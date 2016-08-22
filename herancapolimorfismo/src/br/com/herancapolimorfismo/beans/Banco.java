package br.com.herancapolimorfismo.beans;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class Banco extends Conta{
    Conta [] conta;

    public Banco(Conta[] conta) {
        this.conta = conta;
    }

    public Banco() {
    }
}
