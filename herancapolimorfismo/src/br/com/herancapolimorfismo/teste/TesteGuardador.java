package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.ContaCorrente;
import br.com.herancapolimorfismo.beans.ContaPoupanca;
import br.com.herancapolimorfismo.beans.GuardadorObj;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorObj guardador = new GuardadorObj();
        ContaCorrente cc = new ContaCorrente();
        guardador.adicionaObj(cc);
        ContaPoupanca cp = (ContaPoupanca) (ContaPoupanca) guardador.pegaObj(0);
    }
}