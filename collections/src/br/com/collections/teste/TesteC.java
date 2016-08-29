package br.com.collections.teste;

import br.com.collections.beans.ContaC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteC {
    public static void main(String[] args) {
        ContaC c1 = new ContaC();
        c1.setNome("Nome1");
        c1.setCpf(1258974635);
        c1.setRg("25889753x");
        c1.setLimite(500);
        c1.setSaldo(20.12);
        c1.depositar(200.0);
        c1.sacar(20.40);

        ContaC c2 = new ContaC();
        c2.setNome("Nome2");
        c2.setCpf(123456789);
        c2.setRg("398756421");
        c2.setLimite(1000);
        c2.setSaldo(40);
        c2.depositar(300.0);

        ContaC c3 = new ContaC();
        c3.setNome("Nome3");
        c3.setCpf(987654321);
        c3.setRg("25887965x");
        c3.setLimite(1500);
        c3.setSaldo(5);
        c3.depositar(50.0);

        List<ContaC> conta = new ArrayList<>();
        conta.add(c1);
        conta.add(c2);
        conta.add(c3);

        Collections.sort(conta);

        for (ContaC cc : conta) {
            System.out.println(cc.getTudo() + "\n" + "Saldo " + cc.getSaldo() + "\n");
        }
    }
}