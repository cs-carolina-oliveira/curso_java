package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;
import br.com.herancapolimorfismo.beans.ContaCorrente;
import br.com.herancapolimorfismo.beans.ContaPoupanca;
import br.com.herancapolimorfismo.beans.SaldoInsuficienteException;

public class TesteConta {
    public static void main(String[] args) {

       /* Conta cc = new ContaCorrente();
        cc.depositar(10);

        try {
            cc.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }*/

        Conta c1 = new Conta();
        Conta c2 = new ContaCorrente();
        Conta c3 = new ContaPoupanca();

        c1.depositar(100);
        c2.depositar(500);
        c3.depositar(250);

        c1.atualizar(0.01);
        c2.atualizar(0.02);
        c3.atualizar(0.03);

        //Imprime saldo de clientes
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        System.out.println(c3.getSaldo());


       /* Conta [] minhasContas = new Conta[10];
        System.out.println(minhasContas[4].getSaldo());

        Conta contaNova = new Conta();
        contaNova.setSaldo(1000.0);
        minhasContas[0] = contaNova;*/


        try {
            c1.sacar(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        /*Conta minhaConta = new Conta();
        minhaConta.depositar(100);
        minhaConta.setLimite(1000);
        if (!minhaConta.sacar((1000))) {
            System.out.println("Não saquei");
        }*/
    }
}