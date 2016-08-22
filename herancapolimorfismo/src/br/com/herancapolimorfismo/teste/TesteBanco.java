package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;

import javax.swing.*;

/**
 * Created by carolinaoliveira on 22/08/16.
 */
public class TesteBanco extends Conta{
    public static void main(String[]args){

        Conta conta = new Conta();
        conta.setNome("Danilo");
        conta.setCpf(25598632);
        conta.setRg("258896547");
        conta.setSaldo(34.00);

        JOptionPane.showMessageDialog(null, "Nome "+ conta.getNome()+ "\n" + "Cpf "+ conta.getCpf()+ "\n" + "RG " +
                conta.getRg() + "\n" + "Saldo "+conta.getSaldo());

    }
}

