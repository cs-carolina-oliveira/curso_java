package br.com.interfaces.teste;

import br.com.interfaces.beans.AreaCalculavel;
import br.com.interfaces.beans.Retangulo;

public class TesteInterface {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println(a.calculaArea());
    }
}
