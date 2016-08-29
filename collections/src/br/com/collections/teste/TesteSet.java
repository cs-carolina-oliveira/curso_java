package br.com.collections.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {

        Set<String> cargos = new HashSet<>();

        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Funcionario");
        cargos.add("Gerente");

        System.out.println(cargos);


        Set<String> conjunto = new HashSet<>();
        conjunto.add("item 1");
        conjunto.add("item 2");
        conjunto.add("item 3");

        //retorna o iterator
        for (String palavra : conjunto) {
            System.out.println(palavra);
        }

        /*
        for(String palavra : conjunto){
            System.out.println(palavra);
        }*/
    }
}
