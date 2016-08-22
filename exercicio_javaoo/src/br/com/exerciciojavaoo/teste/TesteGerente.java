package br.com.exerciciojavaoo.teste;

import br.com.exerciciojavaoo.beans.Gerente;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteGerente {
    public static void main(String[]args){
        Gerente gerente = new Gerente();
        gerente.setNome("Jõao");
        gerente.setSenha(1234);
        gerente.setSalario(5015.40);

        gerente.autentica(1234);
        System.out.println("Sua bonificação foi de "+Math.round(gerente.getBonificacao()));
    }
}
