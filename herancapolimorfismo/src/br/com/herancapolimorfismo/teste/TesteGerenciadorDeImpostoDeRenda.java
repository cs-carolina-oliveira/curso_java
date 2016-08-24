package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;
import br.com.herancapolimorfismo.beans.ContaCorrente;
import br.com.herancapolimorfismo.beans.GerenciadorDeImpostoDeRenda;
import br.com.herancapolimorfismo.beans.SeguroDeVida;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteGerenciadorDeImpostoDeRenda {
    public static void main(String[]args){
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida segurov = new SeguroDeVida();
        gerenciador.adiciona(segurov);

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %2f", cc.getSaldo());

    }
}
