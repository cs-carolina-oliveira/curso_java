package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;
import br.com.herancapolimorfismo.beans.ContaCorrente;
import br.com.herancapolimorfismo.beans.ContaPoupanca;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteConta {
    public static void main(String[]args){
       /* Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();*/

        Conta c1 = new Conta();
        Conta c2 = new ContaCorrente();
        Conta c3 = new ContaPoupanca();

        c1.depositar(1000);
        c2.depositar(500);
        c3.depositar(250);

        c1.atualizar(0.01);
        c2.atualizar(0.02);
        c3.atualizar(0.03);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        System.out.println(c3.getSaldo());
    }
}
