package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;
import br.com.herancapolimorfismo.beans.ContaPoupanca;

public class TestePoupanca {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();

        try {
            cp.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Valor Inválido");
        }
    }
}
