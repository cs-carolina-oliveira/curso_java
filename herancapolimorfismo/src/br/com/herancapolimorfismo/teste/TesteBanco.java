package br.com.herancapolimorfismo.teste;

import br.com.herancapolimorfismo.beans.Conta;

import javax.swing.*;


public class TesteBanco extends Conta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNome("Danilo");
        conta.setCpf(25598632);
        conta.setRg("258896547");
        conta.setSaldo(34.00);

        //Imprime dados do cliente
        JOptionPane.showMessageDialog(null, "Nome " + conta.getNome() + "\n" + "Cpf " + conta.getCpf() + "\n" + "RG " +
                conta.getRg() + "\n" + "Saldo " + conta.getSaldo());

    }
}

