package br.com.herancapolimorfismo.beans;

public class Banco extends Conta {
    Conta[] conta;

    public Banco(Conta[] conta) {
        this.conta = conta;
    }

    public Banco() {
    }
}
