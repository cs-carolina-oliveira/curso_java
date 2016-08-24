package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.AtualizaContas;
import br.com.herancapolimorfismo.beans.Conta;

public class TesteAtualizaConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new Conta();
        Conta cp = new Conta();

        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);

        AtualizaContas ac = new AtualizaContas();
        ac.roda(c);
        ac.roda(cc);
        ac.roda(cp);

        System.out.println("Saldo total: " + ac.getSaldoTotal());
    }
}
