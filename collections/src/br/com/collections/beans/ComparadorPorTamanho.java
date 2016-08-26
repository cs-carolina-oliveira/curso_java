package br.com.collections.beans;

import java.util.*;

public class ComparadorPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Sérgio");
        lista.add("Paulo");
        lista.add("Guilherme");

        //invocando sort passando o comparador
        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        Collections.sort(lista, comparador);

        System.out.println(lista);
    }
}
