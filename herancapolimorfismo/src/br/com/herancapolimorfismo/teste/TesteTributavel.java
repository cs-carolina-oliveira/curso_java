package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.ContaCorrente;
import br.com.herancapolimorfismo.beans.Tributavel;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        System.out.println(cc.calculaTributos());

        //testando polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());

    }
}
