package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;

public class TestandoReferenciaNula {
    public static void main(String[] args) {
        Conta c = null;
        System.out.println("Saldo atual " + c.getSaldo());
    }
}
