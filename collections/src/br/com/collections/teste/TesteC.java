package br.com.collections.teste;

import br.com.collections.beans.ContaC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteC {
    public static void main(String[] args) {
        ContaC c1 = new ContaC();
        c1.depositar(200.0);
        ContaC c2 = new ContaC();
        c2.depositar(300.0);
        ContaC c3 = new ContaC();
        c3.depositar(50.0);

        List<ContaC> conta = new ArrayList<>();
        conta.add(c1);
        conta.add(c2);
        conta.add(c3);

        Collections.sort(conta);

        for (int i = 0; i < conta.size(); i++) {
            ContaC cc = conta.get(i);

            System.out.println(cc.getSaldo());
        }
    }
}