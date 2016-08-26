package br.com.collections.teste;

import br.com.collections.beans.Conta;
import br.com.collections.beans.ContaC;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {
        ContaC cc1 = new ContaC();
        cc1.depositar(150);

        ContaC cc2 = new ContaC();
        cc2.depositar(200);

        //Cria Map
        Map<String, ContaC> mapaDeContas = new HashMap<>();

        //add duas chaves e seus respectivos valores
        mapaDeContas.put("diretor", cc1);
        mapaDeContas.put("gerente", cc2);

        //informa conta de diretor
        ContaC contaDiretor = mapaDeContas.get("diretor");
        System.out.println("O saldo do diretor é :" + contaDiretor.getSaldo());

    }
}
