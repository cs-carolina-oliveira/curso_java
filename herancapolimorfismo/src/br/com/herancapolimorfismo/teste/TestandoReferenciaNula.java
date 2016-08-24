package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class TestandoReferenciaNula {
    public static void main(String [] args){
        Conta c = null;
        System.out.println("Saldo atual " + c.getSaldo());
    }
}
