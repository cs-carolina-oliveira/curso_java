package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;

/**
 * Created by carolinaoliveira on 24/08/16.
 */
public class TestePoupanca {
    public static void main(String[]args){
        Conta cp = new Conta();

        try{
            cp.depositar(-100);
        }catch (IllegalArgumentException e){
            System.out.println("Valor Inválido");
        }
    }
}
